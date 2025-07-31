package com.idat.semana2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.semana2.entidad.Persona;
import com.idat.semana2.service.IPersonaService;

//Indica que este controlador va a manejar peticiones REST 
@RestController

// Define la ruta base para todas las URLs
@RequestMapping("/personas")
public class PersonaController {

	// Inyecta el servicio que contiene la lógica de negocio
	@Autowired
	private IPersonaService service;

	// GET: Lista todas las personas
	@GetMapping
	public List<Persona> listar() {
		return service.listar();
	}

	// GET: Buscar una persona por ID
	@GetMapping(value = "buscar/{id}")
	public ResponseEntity<Persona> buscar(@PathVariable("id") Long id) {

		Persona _p = service.buscar(id);
		return new ResponseEntity<Persona>(_p, HttpStatus.OK);
	}

	// GET: Lista paginada de personas
	@GetMapping(value = "pagina")
	public ResponseEntity<Page<Persona>> listarPag(Pageable pag) {
		Page<Persona> p = service.listarPagina(pag);
		return new ResponseEntity<Page<Persona>>(p, HttpStatus.OK);
	}

	// POST: Registrar nueva persona
	@PostMapping("/registrar")
	public ResponseEntity<Persona> registrar(@RequestBody Persona pNueva) {
		Persona p = service.registrar(pNueva);
		return new ResponseEntity<Persona>(p, HttpStatus.CREATED);
	}

	// PUT: Modificar una persona existente
	@PutMapping("/modificar")
	public ResponseEntity<Persona> modificar(@RequestBody Persona pMod) {
		Persona p = service.registrar(pMod);
		return new ResponseEntity<Persona>(p, HttpStatus.OK);
	}

	// DELETE: Eliminar persona por ID
	@DeleteMapping("/eliminar/{id}")
	public boolean eliminar(@PathVariable("id") Long id) {
		return service.eliminar(id);
	}

}
