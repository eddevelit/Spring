package com.lalo.ninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lalo.ninja.component.ExampleComponent;
import com.lalo.ninja.model.Persona;
import com.lalo.ninja.service.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	@Autowired //Indica a Spring que vamos a inyectar un componente
	@Qualifier("exampleComponent") //Indica a Spring el nombre del bean que esta ene la memoria
	private ExampleComponent componente;
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService servicio; 

	// Primera forma
	@RequestMapping(value = "exampleString", method = RequestMethod.GET)
	public String exampleString(Model model) {
		//model.addAttribute("name", "Perro");
		componente.diHola();
		model.addAttribute("persona", servicio.getListPeople());
		return EXAMPLE_VIEW;
	}

	// Segunda forma
	@RequestMapping(value = "exampleMAV", method = RequestMethod.GET)
	public ModelAndView exampleMAV() {
		
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("persona", servicio.getListPeople());
		return mav;
	}
	

}
