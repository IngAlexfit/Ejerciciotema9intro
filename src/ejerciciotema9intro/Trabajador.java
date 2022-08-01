/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciotema9intro;

/**
 *
 * @author Ing_Puello
 */
public class Trabajador extends Persona {
    private double salario;

    public Trabajador(double salario, int edad, String nombre, int teléfono) {
        super(edad, nombre, teléfono);
        this.salario = salario;
    }

    public Trabajador() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
