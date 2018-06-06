
package com.test.apirest.service;

import com.test.apirest.dao.PersonaDao;
import com.test.apirest.entity.Persona;
import java.util.List;
 
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
 

 
@Service("personaService")
public class PersonaService {
 
    @Autowired
    @Qualifier("personaDao")
    private PersonaDao personaDao;
 
    @Transactional
    public Persona getPersonaById(int personaId) {
 
        return personaDao.selectPersonaById(personaId);
    }
 
    @Transactional
    public void addPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }
 
    @Transactional
    public void modifyPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }
 
    @Transactional
    public List<Persona> getAllPersona() {
        return personaDao.selectAllPersona();
 
    }
 
    @Transactional
    public void removePersona(int personaId) {
        personaDao.deletePersona(personaId);
 
    }
 
}