package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaItaliana extends Pizza {

    private String salsa;
    public PizzaItaliana(String name, String salsa, String tamanio, Topping... toppings) {
        super(name, tamanio, toppings);
        this.salsa=salsa;
    }

    public String getsalsa() {
        return salsa;
    }

    public void setsalsa(String salsa) {
        this.salsa = salsa;
    }
}
