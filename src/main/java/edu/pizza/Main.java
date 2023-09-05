package edu.pizza;
import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import edu.pizza.especialidades.PizzaItaliana;
import edu.pizza.especialidades.PizzaMargarita;
import edu.pizza.especialidades.PizzaPepperoni;
import edu.pizza.especialidades.PizzaVegana;


public class Main {
    public static void main(String[] args) {

        PizzaMargarita PizzaMargarita = new PizzaMargarita("Pizza Margherita", "Aceite de oliva extra virgen", "Pequeña");
        PizzaMargarita.addTopping(new Topping("Masa de la pizza", 20));
        PizzaMargarita.addTopping(new Topping("Salsa de tomate", 5));
        PizzaMargarita.addTopping(new Topping("Albahaca fresca", 5 ));
        PizzaMargarita.addTopping(new Topping("Mozzarella fresca",7 ));
        PizzaMargarita.addTopping(new Topping("Tomates cherry", 5));
        System.out.println("El aceite de la pizza margherita es: " + PizzaMargarita.getAceite());
        PizzaMargarita.prepareExpress();
        System.out.println("\n");

        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", "Salsa de tomate", "Grande");
        pizzaItaliana.addTopping(new Topping("Masa de la pizza", 20));
        pizzaItaliana.addTopping(new Topping("Salsa de tomate", 5));
        pizzaItaliana.addTopping(new Topping("Champinones", 8));
        pizzaItaliana.addTopping(new Topping("Mediana", 6));
        pizzaItaliana.addTopping(new Topping("Jamon", 7));
        pizzaItaliana.addTopping(new Topping("Queso", 4));
        System.out.println("La salsa de la pizza italiana es: " + pizzaItaliana.getsalsa());
        pizzaItaliana.prepareClasic();
        System.out.println("\n");


        PizzaPepperoni PizzaPepperoni = new PizzaPepperoni("Pizza Pepperoni", "Pimientos rojos en rodajas", "Mediana");
        PizzaPepperoni.addTopping(new Topping("Masa de la pizza", 20));
        PizzaPepperoni.addTopping(new Topping("Salsa de tomate", 10));
        PizzaPepperoni.addTopping(new Topping("Mozzarella rallada", 5));
        PizzaPepperoni.addTopping(new Topping("Pepperoni", 7));
        PizzaPepperoni.addTopping(new Topping("Cebolla roja en rodajas", 5));
        System.out.println("Los pimientos de la pizza son: " + PizzaPepperoni.getPimientos());
        PizzaPepperoni.prepareClasic();
        System.out.println("\n");


        PizzaVegana PizzaVegana = new PizzaVegana("Pizza Vegana", "Queso vegano", "Grande");
        PizzaVegana.addTopping(new Topping("Masa de la pizza", 20));
        PizzaVegana.addTopping(new Topping("Salsa de tomate", 10));
        PizzaVegana.addTopping(new Topping("Espinacas frescas", 5));
        PizzaVegana.addTopping(new Topping("Aceitunas negras", 7));
        System.out.println("El queso de la pizza vegana es: " + PizzaVegana.getQueso());
        PizzaVegana.prepareExpress();
        System.out.println("\n");

    }
}