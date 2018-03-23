package com.lalo.ninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lalo.ninja.model.Persona;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";

	// Primera forma
	@RequestMapping(value = "exampleString", method = RequestMethod.GET)
	public String exampleString(Model model) {
		//model.addAttribute("name", "Perro");
		model.addAttribute("persona", getPersonas());
		return EXAMPLE_VIEW;
	}

	// Segunda forma
	@RequestMapping(value = "exampleMAV", method = RequestMethod.GET)
	public ModelAndView exampleMAV() {
		
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("persona", getPersonas());
		return mav;
	}
	
	private List<Persona> getPersonas()
	{
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Lalo", 21));
		personas.add(new Persona("Edu", 22));
		personas.add(new Persona("Eduardo", 23));
		personas.add(new Persona("Ed", 21));
		
		return personas;
	}

}
