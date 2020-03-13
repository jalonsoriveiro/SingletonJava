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
         singletonjava.Persona miPersona;
        singletonjava.Persona miPersona2;
         //creacion de obj
         miPersona = singletonjava.Persona.getSingletonInstance("juan","Pilotes",28);

        System.out.println(miPersona.toString());
        singletonjava.Persona tuPersona = singletonjava.Persona.getInstance();
        System.out.println(tuPersona.toString());
        System.out.println(miPersona.toString());
        //este obj no se puede crear ya que existe un objeto creado con id
        miPersona2 = singletonjava.Persona.getSingletonInstance("Jose","Alonso",28);
    }
    
}
