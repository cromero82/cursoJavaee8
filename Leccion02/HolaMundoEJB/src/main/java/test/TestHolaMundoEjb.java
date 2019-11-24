/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEjbImpl;
import beans.HolaMundoEjbRemote;
import javax.naming.*;

/**
 *
 * @author USER
 */
public class TestHolaMundoEjb {
    public static void main(String[] args) {
        System.out.println("Iniciando llamado a EJB desde cliente");
        try {
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoImpl = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoImpl.sumar(2, 3);
            System.out.println("El resultado de la suma = " + resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
