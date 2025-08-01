package com.idat.semana2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.idat.semana2.dao.IPersonaDao;
import com.idat.semana2.entidad.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDao personaDao;

	@Override
	public Persona registrar(Persona p) {

		return personaDao.save(p);
	}

	@Override
	public Persona modificar(Persona p) {

		return personaDao.save(p);
	}

	@Override
	public boolean eliminar(Long id) {
		Optional<Persona> _p = personaDao.findById(id);
		if (_p != null) {
			personaDao.delete(_p.get());
			return true;
		}

		return false;
	}

	@Override
	public Persona buscar(Long id) {

		return personaDao.findById(id).get();
	}

	@Override
	public List<Persona> listar() {

		return personaDao.findAll();
	}

	@Override
	public Page<Persona> listarPagina(Pageable pag) {

		return personaDao.findAll(pag);
	}

	@Override
	public List<Persona> buscarNombreApellido(String nombre, String apellidos) {

		 return personaDao.findByNombreAndApellidos(nombre, apellidos);
	}

	@Override
	public List<Persona> listarPersonas(Long id) {

		return personaDao.listarPersonas(id);
	}

	@Override
	public List<Persona> listarPersonasNativa() {
		List<Persona> personas = new ArrayList<Persona>();
		List<Object[]> lista = personaDao.listarPersonasNativo();
		for (Object[] obj : lista) {
			Persona p = new Persona();
			p.setId(Long.valueOf(obj[0].toString()));
			p.setNombre(obj[1].toString());
			p.setApellidos(obj[2].toString());
			personas.add(p);
		}
		return personas;
	}

}
