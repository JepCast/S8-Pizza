package edu.pizza.base;

import java.util.ArrayList;

public class Topping {
    private double price;
    private String nombre; // Nombre del topping
    private ArrayList<String> ingredientes = new ArrayList<>(); // Ingredientes del topping

    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    // Constructor
    public Topping(String nombre, double price) {
        this.nombre = nombre;
        this.price  = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Topping{" + "nombre='" + nombre + '\'' + ", ingredientes=" + ingredientes + '}';
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

//    public static final Topping base = new Topping("Base de la Pizza", 25.0);
//    public static final Topping Pequeña = new Topping("Pequeña", 0.0);
//    public static final Topping Mediana = new Topping("Mediana", 5.0);
//    public static final Topping Grande = new Topping("Grande", 8.75);
//    public static final Topping tomate = new Topping("Tomate", 5.0);
//    public static final Topping queso = new Topping("Queso", 15.0);
//    public static final Topping pepperoni = new Topping("Pepperoni", 10.0);
//    public static final Topping pepinillo = new Topping("Pepinillo", 3.0);
//    public static final Topping jamon = new Topping("Jamon", 5.0);
//    public static final Topping cebolla = new Topping("Cebolla", 5.0);
//    public static final Topping tocino = new Topping("Tocino", 7.0);
//    public static final Topping pinia = new Topping("Piña", 5.0);
}
