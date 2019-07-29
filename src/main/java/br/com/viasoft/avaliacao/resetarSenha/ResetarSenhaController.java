package br.com.viasoft.avaliacao.resetarSenha;

import br.com.viasoft.avaliacao.usuario.Usuario;
import br.com.viasoft.avaliacao.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("reset-password")
public class ResetarSenhaController {

	@Autowired
	private UsuarioService pessoaService;

	@Autowired
	private ResetarSenhaRepository tokenRepository;
	
	private static final BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder(10);

	@PostMapping()
	public boolean handlePasswordReset(@RequestBody @Valid ResetarSenhaDto resetarSenhaDto) {

		try {
			ResetarSenhaToken token = tokenRepository.findByToken(resetarSenhaDto.getToken());


			Usuario usuario = token.getUsuario();
			
			String updatedPassword = bCrypt.encode(resetarSenhaDto.getSenha());
			
			usuario.setSenha(updatedPassword);
			pessoaService.save(usuario);
			tokenRepository.deleteById(token.getId());

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}