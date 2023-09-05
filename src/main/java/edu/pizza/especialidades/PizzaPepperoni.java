package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaPepperoni extends Pizza {

    private String Pimientos ;
    public PizzaPepperoni(String name, String Pimientos , String tamanio, Topping... toppings) {
        super(name, tamanio, toppings);
        this.Pimientos =Pimientos ;
    }

    public String getPimientos () {
        return Pimientos ;
    }

    public void setPimientos (String Pimientos) {
        this.Pimientos  = Pimientos ;
    }
}
