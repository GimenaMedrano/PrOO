package Clases;

import java.util.List;

public class PizzaItaliana extends Pizza  {

    private String Salsa_Italiana;
    private int tiempo_Horno;
    public PizzaItaliana(String nombre, double precio, List<String> ingredientes) {
        super(nombre, precio, ingredientes);
        this.Salsa_Italiana = Salsa_Italiana;
        this.tiempo_Horno = tiempo_Horno;
    }

    @Override

    public void preparar(){
        super.preparar();
        System.out.println("salsa agregada"+ Salsa_Italiana);

    }
    @Override
    public String toString() {
        return super.toString() + ", salsa: " + Salsa_Italiana + ", tiempo en horno: " + tiempo_Horno + " minutos";
    }
}
