package edu.pizza.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
        private String name;
//        private final double price;
        private List<Topping> toppings = new ArrayList<>();
        private String tamanio;


    public double getTotalPrice() {
        double total = 0;
        for (Topping tp : toppings) {
            total += tp.getPrice();
        }
        if (tamanio.equals("Pequeña")) {
            total += 0;
        } else if (tamanio.equals("Mediana")) {
            double mediana = 20;
            double porcentaje = (mediana /100) * total;
            total += porcentaje;
        } else if (tamanio.equals("Grande")) {
            double grande = 35;
            double porcentaje = (grande /100) * total;
            total += porcentaje;
        }
        return total;
    }

        //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
        public Pizza(String name, String tamanio, Topping... toppings) {
            this.name = name;
//            this.price = price;
            this.tamanio = tamanio;
            for (Topping topping : toppings) {
                this.toppings.add(topping);
            }
        }

        public void addTopping(Topping topping) {
            this.toppings.add(topping);
        }

        public void removeTopping(int index) {
            this.toppings.remove(index);
        }

        public List<Topping> getToppings() {

            return Collections.unmodifiableList(new ArrayList<>(toppings));
        }

        public String getName() {
            return name;
        }

//        public double getPrice() {
//            double total = 0;
//            for (Topping tp : toppings) {
//                total += tp.getPrice();
//            }
//            if (tamanio.equals("Pequeña")) {
//                total += 0;
//            } else if (tamanio.equals("Mediana")) {
//                double mediana = 20;
//                double porcentaje = (mediana /100) * total;
//                total += porcentaje;
//            } else if (tamanio.equals("Grande")) {
//                double grande = 35;
//                double porcentaje = (grande /100) * total;
//                total += porcentaje;
//            }
//            return total;
//        }
        public String getTamanio() {
            return tamanio;
        }

        @Override
        public String toString() {
            return "Pizza{" + "name='" + name + '\'' + "tamaño:"+ tamanio +  "toppings=" + toppings + '}';
        }

        public void prepareExpress() {
            System.out.println("Preparando..... " + name);
            System.out.println("Agregando cada uno de los toppings de forma express:");
            for (Topping topping : toppings) {
                System.out.println("- " + topping.getNombre());
                //put 0.5 seconds of delay
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Tu pizza esta lista para ser servida!");
            System.out.println("El precio total de la "+name+ "de tamaño" +tamanio+ " es: Q" + getTotalPrice());
        }

    public void prepareClasic() {
        System.out.println("Preparando..... " + name);
        System.out.println("Agregando cada uno de los toppings de forma clasica");
        System.out.println("Preparación lenta pero delicosa:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put 3 seconds of delay
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tu pizza esta lista para ser servida!");
        System.out.println("El precio total de la "+name+ "de tamaño" +tamanio+ " es: Q" + getTotalPrice());
        System.out.println("Disfruta mucho de esta delicia al estilo clasico");
    }
    }
