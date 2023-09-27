package com.alura.foro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class Controller {

	@GetMapping
	public String test() {
		return "hola como estas";
	}
}
