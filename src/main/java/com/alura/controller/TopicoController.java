package com.alura.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.modelo.Topico;
import com.alura.topico.DatosRegistroTopico;
import com.alura.topico.TopicoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/topico")
public class TopicoController {
	
	TopicoRepository topicoRepository;
	
	@PostMapping
	public void post(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
		
	}
	
	@GetMapping("/{id}")
	public List<Topico> listaDeTopicos(@PathVariable Long id){
		return topicoRepository.findAll();
	}
}
