package com.dan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.yaml.snakeyaml.tokens.Token.ID;

import com.dan.models.Dojo;
import com.dan.models.Ninja;
import com.dan.services.NinjasService;

@Controller
public class NinjasController {

	private final NinjasService ns;
	
	public NinjasController(NinjasService ns) {
		this.ns = ns;
	}
//--------------------------------------------------------
	
	
	@RequestMapping( value="/new/ninja", method = RequestMethod.POST )
	public String createninjas(@RequestParam(value="dojo_id") Long d_id,
			@RequestParam(value="firstname") String firstname,
			@RequestParam(value="lastname") String lastname,
			@RequestParam(value="age") Long age) {

		Dojo dojoinfo = ns.findDojo(d_id);
		// Este va a Ninjas Service

		Ninja newninja = new Ninja (firstname,lastname,age,dojoinfo);

		ns.createninja(newninja);
		
		return "redirect:/ninja";
	}
	
}
