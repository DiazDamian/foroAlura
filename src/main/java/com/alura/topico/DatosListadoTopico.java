package com.alura.topico;

import java.time.LocalDateTime;

import com.alura.modelo.Curso;
import com.alura.modelo.StatusTopico;
import com.alura.modelo.Usuario;

public record DatosListadoTopico(String titulo,String mensaje,LocalDateTime fechaCreacion, StatusTopico status,Usuario autor, Curso curso) {
	

}
