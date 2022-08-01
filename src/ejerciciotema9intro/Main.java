/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema9intro;

/**
 *
 * @author Ing_Puello 
 */
public class Main {

/*
    Crea una clase Persona con las siguientes variables:
    *La edad
    *El nombre
    *El teléfono
 Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta 
 nueva clase tendrá la variable credito solo para esa clase.

 Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, 
 el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

 Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
 y con una variable salario que solo tenga la clase Trabajador.
*/
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1500.58, 20, "Carlos", 314592659);
        System.out.println("*****Info Cliente*****" + "\n"
                + "Nombre:" + cliente.getNombre()
                + "\nEdad:" + cliente.getEdad()
                + "\nTelefono:" + cliente.getTeléfono()
                + "\nCredito:" + cliente.getCredito());
    
    Trabajador trabajador = new Trabajador(1800, 22, "Federico", 301059088);
        System.out.println("\n*****Info Trabajador*****" + "\n"
                + "Nombre:" + trabajador.getNombre()
                + "\nEdad:" + trabajador.getEdad()
                + "\nTelefono:" + trabajador.getTeléfono()
                + "\nSalario:" + trabajador.getSalario());
    
    }

}
