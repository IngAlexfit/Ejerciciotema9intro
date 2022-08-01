/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciotema9intro;

/**
 *
 * @author Ing_Puello
 */
public class Cliente extends Persona{
    private double credito;

    public Cliente(double credito, int edad, String nombre, int teléfono) {
        super(edad, nombre, teléfono);
        this.credito = credito;
    }

    public Cliente() {
        
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    
    
}
