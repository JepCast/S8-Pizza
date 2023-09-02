package edu.pizza;
import edu.pizza.base.Pizza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import edu.pizza.base.Topping;
import edu.pizza.especialidades.PizzaItaliana;


public class Main {
    public static void main(String[] args) {


        Pizza pizza = new Pizza("Pizza Margherita", 10.99);
        pizza.addTopping(new Topping("Tomato", 10));
        pizza.addTopping(new Topping("Mozzarella",8 ));
        pizza.addTopping(new Topping("Basil", 5));
        pizza.prepare();

        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", "Salsa de tomate", 12.99);
        pizzaItaliana.addTopping(new Topping("Tomato", 10));
        pizzaItaliana.addTopping(new Topping("Champinones", 8));
        pizzaItaliana.addTopping(new Topping("Jamon", 5));
        pizzaItaliana.addTopping(new Topping("Queso", 5));
        pizzaItaliana.prepare();
        System.out.println("La salsa de la pizza italiana es: " + pizzaItaliana.getSalsa());
    }
}