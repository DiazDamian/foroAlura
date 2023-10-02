package com.alura.foro;

import com.alura.modelo.Curso;
import com.alura.modelo.Usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
		@NotNull
		Long id,
		@NotBlank
		String titulo,
		@NotBlank
		String mensaje,
		@NotNull
		Usuario autor,
		@NotNull
		Curso curso) {

}
