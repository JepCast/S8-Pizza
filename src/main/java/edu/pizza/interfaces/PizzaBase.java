package edu.pizza.interfaces;

public class PizzaBase implements IPreparable{
    private String nombre;
    private double precio;
    public PizzaBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public  void prepare(){
        System.out.println("Preparando pizza...");
        System.out.println("La pizza esta lista!!!");
    }
}
