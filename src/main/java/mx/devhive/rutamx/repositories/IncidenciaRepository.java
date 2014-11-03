package mx.devhive.rutamx.repositories;


import mx.devhive.rutamx.entities.TtrIncidencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepository extends JpaRepository<TtrIncidencia, Integer> {
	long countByIncidenciaId(int incidenciaId);
}
