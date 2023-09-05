package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaMargarita extends Pizza {

    private String aceite;
    public PizzaMargarita(String name, String aceite, String tamanio, Topping... toppings) {
        super(name, tamanio, toppings);
        this.aceite=aceite;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }
}
