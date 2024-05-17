package org.learning;

public class Main {
    public static void main(String[] args) {

        Prodotto product1 = new Prodotto("paperino","pippo",599.99,12345678);
        //Stampo l'oggetto completo
        System.out.println("Oggetto completo" + " " + product1);
        //Stampo il codice del prodotto
        System.out.println("Codice prodotto" + " " + product1.getCode());
        //Stampo il prezzo base
        System.out.println("Prezzo base" + " " + product1.getPrice());
        //Stampo il prezzo comprensivo di iva
        System.out.println("Prezzo con iva" + " " + product1.getPriceWithVat());
        //Stampo nome esteso del prodotto
        System.out.println("Nome completo" + " " + product1.getFullName());
    }
}
