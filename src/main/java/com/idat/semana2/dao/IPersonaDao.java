package com.idat.semana2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.semana2.entidad.Persona;

public interface IPersonaDao extends JpaRepository<Persona,Long>{
	

}
