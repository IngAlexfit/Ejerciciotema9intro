/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciotema9intro;

/**
 *
 * @author Ing_Puello
 */
public class Persona {

    private int edad ;

    private String nombre ;

    private int teléfono ;

    public Persona(int edad, String nombre, int teléfono) {
        this.edad = edad;
        this.nombre = nombre;
        this.teléfono = teléfono;
    }

    public Persona() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }
    
    
}
