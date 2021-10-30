package com.dan.services;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.tokens.Token.ID;

import com.dan.models.Dojo;
import com.dan.models.Ninja;
import com.dan.repositories.DojosRepository;
import com.dan.repositories.NinjasRepository;

@Service
public class NinjasService {

	private final NinjasRepository nr;
	private final DojosRepository dr;
	
	public NinjasService(NinjasRepository nr , DojosRepository dr) {
		this.nr = nr;
		this.dr = dr;
	}
//-----------------------------------------------------------
	public void createninja(Ninja ninja) {
		nr.save(ninja);
	}

	
	public Dojo findDojo(Long id) {
		return  dr.findById(id);
	}
	
}
