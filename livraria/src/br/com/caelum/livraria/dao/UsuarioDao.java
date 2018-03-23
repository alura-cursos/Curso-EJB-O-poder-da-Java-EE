package br.com.caelum.livraria.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.modelo.Usuario;

@Stateless
public class UsuarioDao {
	@Inject
	private Banco banco;

	public Usuario buscaPeloLogin(String login) {
		return this.banco.buscaPeloNome(login);
	}
	
}
