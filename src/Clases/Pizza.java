package Clases;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private  String nombre;
    private double precio;
    private String [] ingredientes;
    private List<Topping> toppings;


    public static final String Queso_Pizaa = "queso";
    public static final String Tomate_Pizza= "salsa";
    public static final String Masa_Pizza= "masa";

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes.toArray(new String[0]);;
        this.toppings = new ArrayList<>();
    }

    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista, puede ser entregada.");
    }

    public String toString() {
        return "Pizza " + nombre + ", y su precio es: " + precio;
    }

    public void agregarTopping(Topping topping) {
        toppings.add(topping);
    }

    public void mostrarToppings() {
        System.out.println("Toppings de la pizza " + nombre + ":");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
        }

    }}
