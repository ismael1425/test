package com.test.apirest.controller;

import com.test.apirest.entity.Persona;
import com.test.apirest.service.PersonaService;
import java.util.List;
 
import javax.validation.Valid;
import javax.ws.rs.Consumes;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class PersonaController {
 
    @Autowired
    @Qualifier("personaService")
    private PersonaService personaService;
 
    @PostMapping("/api/persona")
    @Consumes("application/json")
    public void createNewPersona(@Valid @RequestBody Persona persona) {
        personaService.addPersona(persona);
    }
 
    @PutMapping("/api/changepersona")
    @Consumes("application/json")
    public void changeExistingPersona(@Valid @RequestBody Persona persona) {
        personaService.modifyPersona(persona);
    }
 
    @DeleteMapping("/api/removepersona/{id}")
    public void removePersona(@PathVariable(value = "id") int personaId) {
        personaService.removePersona(personaId);
    }
 
    @GetMapping("/api/viewsinglepersona/{id}")
    public Persona viewPersonaById(@PathVariable(value = "id") int personaId) {
        return personaService.getPersonaById(personaId);
    }
 
    @GetMapping("/api/personas")
    public List<Persona> viewAllPersona() {
        return personaService.getAllPersona();
    }
 
}