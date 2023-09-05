package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaVegana extends Pizza {

    private String Queso ;
    public PizzaVegana(String name, String Queso , String tamanio, Topping... toppings) {
        super(name, tamanio, toppings);
        this.Queso =Queso ;
    }

    public String getQueso () {
        return Queso ;
    }

    public void setQueso (String Queso ) {
        this.Queso  = Queso ;
    }
}
