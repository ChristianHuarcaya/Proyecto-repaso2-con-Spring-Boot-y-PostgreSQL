package com.idat.semana2.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.idat.semana2.entidad.Persona;

public interface IPersonaService {

	Persona registrar(Persona p);

	Persona modificar(Persona p);
    boolean eliminar(Long id);
    Persona buscar(Long id);

	List<Persona> listar();

	Page<Persona> listarPagina(Pageable pag);
	
	List<Persona> buscarNombreApellido(String nombre, String apellidos);
	List<Persona> listarPersonas(Long id);
	List<Persona> listarPersonasNativa();
	

}
