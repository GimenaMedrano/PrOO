import Clases.Pizza;
import Clases.Topping;
import Clases.PizzaItaliana;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<String> ingredientesPizza = new ArrayList<>();
        ingredientesPizza.add(Pizza.Queso_Pizaa);
        ingredientesPizza.add(Pizza.Tomate_Pizza);
        ingredientesPizza.add(Pizza.Masa_Pizza);


        Pizza miPizza = new Pizza("Simple", 60.00, ingredientesPizza);
        miPizza.preparar();
        System.out.println(miPizza);


        Topping queso = new Topping("quesoExtra");
        Topping champiniones = new Topping("champiñones");
        Topping pepperoni = new Topping("pepperoni");
        Topping salsa = new Topping("salsaExtra");

        List<Topping> listaDeToppings = new ArrayList<>();
        listaDeToppings.add(queso);
        listaDeToppings.add(champiniones);
        listaDeToppings.add(pepperoni);
        listaDeToppings.add(salsa);

        Pizza PizzaTop = new Pizza("Pizza_Toppings", 100.00 , ingredientesPizza);
        System.out.println(PizzaTop);
        PizzaTop.preparar();

        PizzaTop.agregarTopping(listaDeToppings.get(0)); // Agrega el topping queso
        PizzaTop.agregarTopping(listaDeToppings.get(1)); // Agrega el topping champiñones
        PizzaTop.agregarTopping(listaDeToppings.get(2));

        PizzaTop.mostrarToppings();

        PizzaItaliana miPizzaItaliana = new PizzaItaliana("Italiana Especial", 95.99, ingredientesPizza, " Italiana", 20);

        miPizzaItaliana.mostrarToppings();

        miPizzaItaliana.preparar();
        System.out.println(miPizzaItaliana);
        miPizzaItaliana.agregarTopping(listaDeToppings.get(3));


    }
}