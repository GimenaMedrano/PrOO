package Clases;

import java.util.List;

public class Pizza {

    private  String nombre;
    private double precio;
    private String [] ingredientes;


    public static final String Queso_Pizaa = "queso";
    public static final String Tomate_Pizza= "tomate";

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes.toArray(new String[0]);;
    }
    // Método para simular la preparación de la pizza
    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista, puede ser entregada.");
    }

    public String toString() {
        return "Pizza " + nombre + ", y su precio es: " + precio;
    }

}
