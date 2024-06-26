package org.learning;

public class Main {
    public static void main(String[] args) {

        Prodotto product1 = new Prodotto("paperino","pippo",599.99);
        //Stampo l'oggetto completo
        System.out.println("****** Oggetto completo" + " " + product1);
        //Stampo il codice del prodotto
        System.out.println("Codice prodotto" + " " + product1.getCode());
        //Stampo il prezzo base
        System.out.println("Prezzo base" + " " + product1.getPrice());
        //Stampo il prezzo comprensivo di iva
        System.out.println("Prezzo con iva" + " " + product1.getPriceWithVat());
        //Stampo nome esteso del prodotto
        System.out.println("Nome completo" + " " + product1.getFullName());

        //Modifico il nome del prodotto
        product1.setName("Giordano");
        //Modifico il numero di partita iva
        product1.setVat(0.24);
        //Modifico la descrizione del prodotto
        product1.setDescription("Frigorifero fantastico");

        //Stampo l'oggetto completo
        System.out.println("******* Oggetto completo" + " " + product1);
    }
}
