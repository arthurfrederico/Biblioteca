package br.com.livros.biblioteca.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.livros.biblioteca.model.Biblioteca;

public interface BibliotecaRepo extends CrudRepository <Biblioteca, Integer> {

	ArrayList<Biblioteca> findByOrderByTitulo();

}
