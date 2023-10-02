package com.alura.foro;

import java.time.LocalDateTime;

import com.alura.modelo.Curso;
import com.alura.modelo.StatusTopico;
import com.alura.modelo.Topico;
import com.alura.modelo.Usuario;

public record DatosListaTopicos(Long id,String titulo,String mensaje,LocalDateTime fechaCreacion,StatusTopico status,Usuario autor,Curso curso ) {

	public DatosListaTopicos(Topico topico) {
		this(topico.getId(),topico.getTitulo(),topico.getMensaje(),topico.getfechaCreacion(),topico.getStatus(),topico.getAutor(),topico.getCurso());
	}
}
