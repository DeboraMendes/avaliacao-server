package br.com.viasoft.avaliacao.resetarSenha;

import br.com.viasoft.avaliacao.crud.CrudServiceImpl;
import br.com.viasoft.avaliacao.usuario.Usuario;
import br.com.viasoft.avaliacao.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ResetarSenhaServiceImpl extends CrudServiceImpl<ResetarSenhaToken, Long> implements ResetarSenhaService {

	@Autowired
	private ResetarSenhaRepository resetarSenhaRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	protected JpaRepository<ResetarSenhaToken, Long> getRepository() {
		return resetarSenhaRepository;
	}

	@Override
	public void criptografarSenha(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if (usuario.getId() == null) {
			usuario.setSenha(encoder.encode(usuario.getSenha()));
		} else {
			Usuario antigo = usuarioRepository.findById(usuario.getId()).orElse(null);
			if (antigo != null &&
					!usuario.getSenha().equals(antigo.getSenha())) {
				usuario.setSenha(encoder.encode(usuario.getSenha()));
			}
		}

	}

	@Override
	public void atualizarSenha(String senha, Long id) {
		usuarioRepository.atualizarSenha(senha, id);

	}

	@Override
	public ResetarSenhaToken findByToken(String token) {
		return resetarSenhaRepository.findByToken(token);
	}
}



