package com.lalo.ninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.lalo.ninja.model.Persona;
import com.lalo.ninja.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	@Override
	public List<Persona> getListPeople() {
			List<Persona> personas = new ArrayList<>();
			personas.add(new Persona("Lalo", 21));
			personas.add(new Persona("Edu", 22));
			personas.add(new Persona("Eduardo", 23));
			personas.add(new Persona("Ed", 21));
			LOG.info("Hola desde el servicio :3");
			return personas;
	}


}
