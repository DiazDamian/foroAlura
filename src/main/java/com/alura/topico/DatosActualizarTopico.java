package com.alura.topico;

import com.alura.modelo.Curso;
import com.alura.modelo.Usuario;

public record DatosActualizarTopico(Long id,String titulo,String mensaje,Usuario autor,Curso curso) {

}
