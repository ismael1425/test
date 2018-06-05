package org.tahsan.springboot.starter.persona;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;
	
	
	public List<Persona> getAllPersonas() {
		List<Persona> personas = new ArrayList<Persona>();
		personaRepository.findAll().forEach(personas::add);
		return personas;
	}
	
	public Persona getPersona(String id) {
		return personaRepository.findOne(id);
	}
	
	public void addPersona(Persona persona) {
		personaRepository.save(persona);
	}
	
	public void updatePersona(String id, Persona persona) {
		personaRepository.save(persona);
	}
	
	public void deletePersona(String id) {
		personaRepository.delete(id);
	}
	
	

}
