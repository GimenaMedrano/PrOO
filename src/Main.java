import Clases.Pizza;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<String> ingredientesPizza = new ArrayList<>();
        ingredientesPizza.add(Pizza.Queso_Pizaa);
        ingredientesPizza.add(Pizza.Tomate_Pizza);


        Pizza miPizza = new Pizza("Simple", 60.00, ingredientesPizza);
        miPizza.preparar();
        System.out.println(miPizza);

    }
}