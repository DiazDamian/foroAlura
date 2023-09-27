package com.alura.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
