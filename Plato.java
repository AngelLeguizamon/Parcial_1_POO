package unrestaurante;

import java.util.*;

public class Plato {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {                // Metodo para crear un objeto de la clase "Plato"
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarPlato() {                                             // Se declara un método para mostrar la información del plato
        System.out.println("- " + nombre + ", Precio: $" + precio);
    }

    public static void AgregarPlato(Scanner scan, ArrayList<Plato> listaPlatos) {
        System.out.println("Ingrese el nombre del nuevo plato:");
        String nombre = scan.next();
        System.out.println("Ingrese el precio del nuevo plato:");
        int precio = scan.nextInt();

        listaPlatos.add(new Plato(nombre, precio));                  //Se agrega un nuevo objeto con los datos ingresados a la listaPlatos

    }

}

