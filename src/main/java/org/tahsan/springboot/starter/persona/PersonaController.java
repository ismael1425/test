package org.tahsan.springboot.starter.persona;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	final Logger logger = LoggerFactory.getLogger(PersonaController.class);

	@RequestMapping("/personas")
	public List<Persona> getAllTopics() {
		logger.debug("I am in getAllPersonas");
		return personaService.getAllPersonas();
	}
	
	
	@RequestMapping("/personas/{id}")
	public Persona getTopics(@PathVariable String id) {
		return personaService.getPersona(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/personas")
	public void addPersona(@RequestBody Persona persona) {
		personaService.addPersona(persona);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/personas/{id}")
	public void updatePersona(@RequestBody Persona persona, @PathVariable String id) {
		logger.debug("updatePersona");
		personaService.updatePersona(id, persona);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value ="/personas/{id}")
	public void deletePersona(@PathVariable String id) {
		personaService.deletePersona(id);
	}

}
