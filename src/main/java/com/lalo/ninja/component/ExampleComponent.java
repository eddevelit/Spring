package com.lalo.ninja.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("exampleComponent")
public class ExampleComponent {

	public static final Log LOG= LogFactory.getLog(ExampleComponent.class); 
	public void diHola()
	{
		LOG.info("Hola desde componente");
	}
}
