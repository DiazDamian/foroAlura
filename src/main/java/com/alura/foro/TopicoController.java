package com.alura.foro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.modelo.Topico;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/topico")
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	@PostMapping
	@Transactional
    public void registrarTopico(@RequestBody @Valid DatosRecordTopico datosRecordTopico) {
        topicoRepository.save(new Topico(datosRecordTopico));
    }
	@GetMapping("/{id}")
	public Page<DatosListaTopicos> ListaTopicos(@PageableDefault Pageable paginacion) {
		return topicoRepository.findByActivoTrue(paginacion).map(DatosListaTopicos::new);
	}
	 @PutMapping
	    @Transactional
	    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
	        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
	        topico.actualizarDatos(datosActualizarTopico);
	    }
	@DeleteMapping("/{id}")
    @Transactional
	public void eliminarTopico(@PathVariable Long id) {
      Topico topico = topicoRepository.getReferenceById(id);
      topicoRepository.delete(topico);
  }
}
