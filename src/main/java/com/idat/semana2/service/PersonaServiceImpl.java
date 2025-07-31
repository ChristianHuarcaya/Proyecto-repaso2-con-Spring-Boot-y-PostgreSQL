package com.idat.semana2.service;


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
		Optional<Persona> _p= personaDao.findById(id);
		if (_p!=null) {
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

}
