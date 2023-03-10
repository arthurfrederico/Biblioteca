package br.com.livros.biblioteca.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.livros.biblioteca.model.Biblioteca;
import br.com.livros.biblioteca.repo.BibliotecaRepo;

@RestController
public class BibliotecaController {

	@Autowired
	private BibliotecaRepo repo;

	@GetMapping("/biblioteca")
	public ArrayList<Biblioteca> recuperarTodos() {
		ArrayList<Biblioteca> lista = repo.findByOrderByTitulo();
		return lista;

	}
	
	@PostMapping("/biblioteca")
	public ResponseEntity<Biblioteca> adicionarNovo(@RequestBody Biblioteca c) {
		Biblioteca res = repo.save(c);
		if (res != null) {
			return ResponseEntity.status(201).body(res);
		}
		return ResponseEntity.badRequest().build();
}
}
