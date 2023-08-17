package Clases;

import java.util.List;

public class PizzaItaliana extends Pizza  {

    private String salsa_Italiana;
    private int tiempo_Horno;

    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa_Italiana, int tiempo_Horno) {
        super(nombre, precio, ingredientes);
        this.salsa_Italiana= salsa_Italiana;
        this.tiempo_Horno = tiempo_Horno;
    }

    @Override

    public void preparar(){
        super.preparar();
        System.out.println("salsa agregada"+ salsa_Italiana);

    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " +  salsa_Italiana+ ", tiempo en horno: " + tiempo_Horno + " minutos";
    }

}
