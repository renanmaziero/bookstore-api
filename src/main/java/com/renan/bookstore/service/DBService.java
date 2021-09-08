package com.renan.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renan.bookstore.domain.Categoria;
import com.renan.bookstore.domain.Livro;
import com.renan.bookstore.repositories.CategoriaRepository;
import com.renan.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null, "Informática", "livro de TI");
		Categoria cat2 = new Categoria(null, "Informática2", "livro de TI 2");
		Categoria cat3 = new Categoria(null, "Informática3", "livro de TI 3");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "Clean code 2", "Robert Martin 2", "Lorem ipsum 2", cat1);
		Livro l3 = new Livro(null, "Clena code 3", "Robert Martin 3", "Lorem ipsum 3", cat2);
		Livro l4 = new Livro(null, "Clena code 4", "Robert Martin 4", "Lorem ipsum 4", cat2);
		Livro l5 = new Livro(null, "Clena code 5", "Robert Martin 5", "Lorem ipsum 5", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
