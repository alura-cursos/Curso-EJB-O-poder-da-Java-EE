package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
public class LivroDao {
	@Inject
	private Banco banco;
	
	public void salva(Livro livro) {
		banco.save(livro);
	}
	
	public List<Livro> todosLivros() {
		return banco.listaLivros();
	}
	
}
