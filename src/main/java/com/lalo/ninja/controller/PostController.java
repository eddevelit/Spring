package com.lalo.ninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lalo.ninja.model.Persona;

@Controller
@RequestMapping("/post")
public class PostController {
	
	public static final String FORM = "formulario";
	public static final String RESULT = "resultado";
	
	public static final Log LOG = LogFactory.getLog(PostController.class);
	
	//Reedireccionando
	/*
	@GetMapping("/")
	public String dirigiendo ()
	{
		return "redirect:/post/form";
	}
	*/
	@GetMapping("/")
	public RedirectView redirigir()
	{
		return new RedirectView("/post/form");
	}
	
	@GetMapping("/form")
	public String mostrarForm(Model model)
	{
		/*LOG.info("Log de advertencia");
		LOG.warn("Log de warning");
		LOG.error("Log de error");
		LOG.debug("Log de debug");
		*/
		model.addAttribute("yo", new Persona());
		return FORM;
	}
	
	@PostMapping("/agregaPersona")
	public 	ModelAndView addPerson(@ModelAttribute("yo") Persona persona)
	{
		LOG.info("METHOD: 'addPerson' -- PARAMS: '" + persona + "'");
		ModelAndView mav = new ModelAndView(RESULT);	
		mav.addObject("yo", persona);
		LOG.info("TEMPLATE: '"+ RESULT + "' -- DATA: '" + persona + "'");
		return mav;
		}
}
