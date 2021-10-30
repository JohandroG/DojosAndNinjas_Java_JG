package com.dan.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dan.models.Dojo;
import com.dan.repositories.DojosRepository;

@Service
public class DojosService {

	
	private final DojosRepository dr;	
	
	public DojosService(DojosRepository dr) {
		this.dr = dr;
	}
	
	public List<Dojo> getalldojos() {
		return dr.findAll();
	}
	
	public Dojo createDojo(Dojo dojoinfo) {
		return dr.save(dojoinfo);
	}
	
	public Dojo requestDojoInfo(Long id) {
		return dr.findById(id);
	}
	
}
