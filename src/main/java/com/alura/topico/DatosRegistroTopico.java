package com.alura.topico;

import com.alura.modelo.Curso;
import com.alura.modelo.Usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
		@NotBlank
		String titulo,
		@NotBlank
		String mensaje,
		@NotNull
		Usuario autor,
		@NotNull
		Curso curso) {

}
