package br.com.viasoft.avaliacao.resetarSenha;

import br.com.viasoft.avaliacao.crud.CrudService;
import br.com.viasoft.avaliacao.usuario.Usuario;

public interface ResetarSenhaService extends CrudService<ResetarSenhaToken, Long> {

	ResetarSenhaToken findByToken(String token);

	void atualizarSenha(String senha, Long pessoaId);
	
	void criptografarSenha(Usuario usuario);
}
