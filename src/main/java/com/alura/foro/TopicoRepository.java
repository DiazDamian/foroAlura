package com.alura.foro;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.modelo.Topico;



public interface TopicoRepository extends JpaRepository<Topico, Long> {
	Page<Topico> findByActivoTrue(Pageable paginacion);
}
