package com.dan.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dan.models.Dojo;
import com.dan.services.DojosService;

@Controller
public class DojosController {

private final DojosService ds;
	
	public DojosController(DojosService ds) {
		this.ds = ds;
	}
	
//---------------------------------------------------------------------
	
	@RequestMapping( value="/", method = RequestMethod.GET )
	public String home() {
		return "redirect:/dojo";
		
	}
	
	
	@RequestMapping( value="/ninja", method = RequestMethod.GET )
	public String displaydojosforninjas(Model model) {

		List<Dojo> dojosList = ds.getalldojos();

		model.addAttribute("dojoList", dojosList);
		return "newninja.jsp";
		
	}
	
	@RequestMapping( value="/dojo", method = RequestMethod.GET )
	public String displaycreatedojos(Model model) {

		List<Dojo> dojosList = ds.getalldojos();

		model.addAttribute("dojoList2", dojosList);
		return "newdojo.jsp";
		
	}
	
	@RequestMapping( value="/new/dojo", method = RequestMethod.POST )
	public String createdojos(@RequestParam(value="dojo") String name) {
		
		Dojo newdojo = new Dojo(name);
		ds.createDojo(newdojo);
		return "redirect:/dojo";
	}

	@RequestMapping( value="/info/dojo/{id}", method = RequestMethod.GET )
	public String DisplayDojosInfo(@PathVariable("id") Long id, Model model) {
		
		  Dojo dojoinfo = ds.requestDojoInfo(id);
		  
		  model.addAttribute("dojoInfo", dojoinfo);
		
		return "info.jsp";
	}
	

}
