package com.alura.foro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicoController {

	@PostMapping
	public void post(@RequestBody DatosRecordTopico data) {
		System.out.println(data);
	}
	@GetMapping
	public String get() {
		return "hola anda";
	}
}
