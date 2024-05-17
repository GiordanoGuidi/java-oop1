package org.learning;


public class Prodotto {

    //ATTRIBUTI
    private int code;
    String name;
    String description;
    double price;
    int vatNumber;

    //COSTRUTTORI

    public Prodotto(String name,String description,double price,int vatNumber) {
        this.code = getRandomNumber();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vatNumber = vatNumber;
    }

    //METODI
    //Genero un numero random
    int getRandomNumber(){
        int randomInt = (int) (Math.random() * 999999)+1;
        System.out.println(randomInt);
        return randomInt;
    }
    //Getter per l'attributo private code
    public int getCode(){
      return code;
    }
    //Metodo per avere il prezzo base
    public double getPrice(){
        return price;
    }
    //Metodo per calcolare il prezzo compreso di iva
    public double getPriceWithVat(){
        double iva = price*22 /100;
        double priceWithVat = price + iva;
        return priceWithVat;
    }
    //Metodo per avere nome esteso
    public String getFullName(){
      String fullName = code + "-"+ name;
      return fullName;
    }


    // Sovrascrivo il metodo toString()
    @Override
    public String toString() {
        return "Prodotto[codice=" + code + ", nome=" + name + ", " +
                "description=" + description + ", price=" + price + "vatNumber=" + vatNumber +"]";
    }
}
