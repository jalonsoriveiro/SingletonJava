/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonjava;

/**
 *
 * @author jose
 */
public class SingletonJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Persona miPersona;
    miPersona = Persona.getSingletonInstance("Hostia","Pilotes",28);
        System.out.println(miPersona.toString());
        Persona tuPersona = Persona.getInstance();
        System.out.println(tuPersona.toString());
        System.out.println(miPersona.toString());
    }
    
}
