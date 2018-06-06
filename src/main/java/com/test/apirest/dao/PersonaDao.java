
package com.test.apirest.dao;

import com.test.apirest.entity.Persona;
import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
import org.springframework.stereotype.Repository;

 
@Repository("personaDao")
public class PersonaDao {
 
    @PersistenceContext
    private EntityManager entityManager;
 
    public Persona selectPersonaById(int personaId) {
        return entityManager.find(Persona.class, personaId);
    }
 
    public void insertPersona(Persona persona) {
        entityManager.persist(persona);
    }
 
    public void updatePersona(Persona persona) {
 
        Persona personaToUpdate = selectPersonaById(persona.getPersonaId());
 
        personaToUpdate.setPersonaNombre(persona.getPersonaNombre());
        personaToUpdate.setPersonaApellido(persona.getPersonaApellido());
        personaToUpdate.setPersonaEdad(persona.getPersonaEdad());
        personaToUpdate.setPersonaSexo(persona.getPersonaSexo());
        entityManager.flush();
    }
 
    public void deletePersona(int personaId) {
        entityManager.remove( selectPersonaById(personaId));
    }
 
    public List<Persona> selectAllPersona() {
        Query query = entityManager.createQuery("from Persona as prs order by prs.personaId");
        return (List<Persona>) query.getResultList();
    }
 
}