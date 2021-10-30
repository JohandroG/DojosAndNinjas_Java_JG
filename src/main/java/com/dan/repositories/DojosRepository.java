package com.dan.repositories;

import java.util.List;
import org.springframework.data.repository.Repository;

import com.dan.models.Dojo;

public interface DojosRepository extends Repository <Dojo,Long>{

	List<Dojo> findAll();
	Dojo save(Dojo dojo);
	
	Dojo findById(Long id); //Este convierte mi ID en un objeto dojo
	
}
