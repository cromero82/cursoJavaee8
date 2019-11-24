/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Persona;

/**
 *
 * @author USER
 */

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(1,"CARLOS","ROMERO","carlos@mail.co", "3111111"));
        personas.add(new Persona(2,"ISABELLA","ROMERO","isa@mail.co", "3222222"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return (new Persona(1,"CARLOS","ROMERO","carlos@mail.co", "3111111"));
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return (new Persona(2,"ISABELLA","ROMERO","isa@mail.co", "3222222"));
    }

    @Override
    public void crearPersona(Persona persona) {
        
    }

    @Override
    public void modificarPersona(Persona persona) {
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
        
    }
    
}
