/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.cliente;

import java.util.List;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

/**
 *
 * @author USER
 */
public class ClientePersonaServicio {
    public static void main(String[] args) {
        System.out.println("Iniciando consulta personaEJB desde cliente");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaSR = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaSR.listarPersonas();
            for(Persona persona:personas){
                System.out.println(persona.toString());  
            }
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println("Finalizando consulta personaEJB desde cliente");
    }

}
