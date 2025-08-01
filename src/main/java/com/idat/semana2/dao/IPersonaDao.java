package com.idat.semana2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idat.semana2.entidad.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

	List<Persona> findByNombreAndApellidos(String nombre, String apellidos);


	@Query("FROM Persona p WHERE p.id = :id")
	List<Persona> listarPersonas(@Param("id") Long id);

	@Query(value = "select id, nombre,apellidos from persona", nativeQuery = true)
	List<Object[]> listarPersonasNativo();

	
}
