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
public class Persona {
private String nombre;
private String apellido;
private int edad;
private static Persona id;

    private Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    private Persona() {
    }

    public static Persona getInstance(){
    if (id == null){
    id = new Persona();
    } 
        return id;   
    }
    
    public static Persona getSingletonInstance(String nombre, String apellido, int edad){
    if (id==null){
            id= new Persona(nombre,apellido,edad);
           
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre+apellido+edad);
        }
        return id;
    } 
    public void setNombre(String nombre) {
        id.nombre = nombre;
    }

    public void setApellido(String apellido) {
        id.apellido = apellido;
    }

    public void setEdad(int edad) {
        id.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Persona :" + "\n nombre = " + nombre + "\napellido = " 
                +  apellido + "\nedad = " + edad + "\n";
    }


}
