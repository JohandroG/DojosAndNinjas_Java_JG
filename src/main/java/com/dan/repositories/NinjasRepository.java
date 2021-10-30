package com.dan.repositories;

import java.util.List;
import org.springframework.data.repository.Repository;


import com.dan.models.Dojo;
import com.dan.models.Ninja;


public interface NinjasRepository extends Repository <Ninja,Long>{

	List<Ninja> findAll();

	Ninja save(Ninja ninja);

}
