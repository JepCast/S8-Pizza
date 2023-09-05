package edu.pizza.interfaces;

public class PizzaBase implements IPreparable{
    private final String tamanio;
    private String nombre;
    private final double precio;
    public PizzaBase(String nombre, double precio, String tamanio) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamanio = tamanio;
    }
    @Override
    public  void prepareExpress(){
        System.out.println("Preparando pizza express...");
        System.out.println("La pizza esta lista!!!");
    }

    @Override
    public void prepareClasic(){
        System.out.println("Preparando pizza al estilo clasico...");
        System.out.println("La pizza esta lista!!!");
    }
}
