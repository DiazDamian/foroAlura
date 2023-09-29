package com.alura.foro;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.modelo.Topico;
import com.alura.topico.DatosActualizarTopico;
import com.alura.topico.DatosRegistroTopico;
import com.alura.topico.TopicoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/topico")
public class Controller {

	private TopicoRepository topicoRepository;
	
	@PostMapping
	public void postTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
		topicoRepository.save(new Topico(datosRegistroTopico));
	}
	
	@GetMapping
	public List<Topico> getTopico(){
		return topicoRepository.findAll();
	}
	@PutMapping
	public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico actualizarTopico) {
		Topico topico = topicoRepository.getReferenceById(actualizarTopico.id());
		topico.actualizarTopico(actualizarTopico);
	}
	@DeleteMapping("/{id}")
	public void eliminarTopico(@RequestBody Long id) {
		Topico topico = topicoRepository.getReferenceById(id);
		topico.desactivarTopico();
	}
	/*
	@GetMapping
	public String test() {
		return "hola como estas";
	}
	*/
}
