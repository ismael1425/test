package com.test.apirest.entity;

 
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
 

 
@Entity
@Table(name = "persona_table")
public class Persona {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "persona_id")
    private int personaId;
 
    @Column(name = "persona_nombre")
    private String personaNombre;
 
    @Column(name = "persona_apellido")
    private String personaApellido;
 
    @Column(name = "persona_edad")
    private int personaEdad;
 
    @Column(name = "persona_sexo")
    private String personaSexo;

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getPersonaNombre() {
        return personaNombre;
    }

    public void setPersonaNombre(String personaNombre) {
        this.personaNombre = personaNombre;
    }

    public String getPersonaApellido() {
        return personaApellido;
    }

    public void setPersonaApellido(String personaApellido) {
        this.personaApellido = personaApellido;
    }

    public int getPersonaEdad() {
        return personaEdad;
    }

    public void setPersonaEdad(int personaEdad) {
        this.personaEdad = personaEdad;
    }

    public String getPersonaSexo() {
        return personaSexo;
    }

    public void setPersonaSexo(String personaSexo) {
        this.personaSexo = personaSexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "userId=" + personaId + ", personaNombre=" + personaNombre + ", personaApellido=" + personaApellido + ", personaEdad=" + personaEdad + ", personaSexo=" + personaSexo + '}';
    }
 
   
 
}