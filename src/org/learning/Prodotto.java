package org.learning;


public class Prodotto {

    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;

    //COSTRUTTORE
    public Prodotto(String name,String description,double price) {
        this.code = getRandomNumber();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = 0.22;
    }

    //METODI
    //Genero un numero random
    int getRandomNumber(){
        int randomInt = (int) (Math.random() * 9)+1;
        System.out.println(randomInt);
        return randomInt;
    }
    //Getter per l'attributo private code
    public String getCode(){
        /*Trasformo in codice in stringa e se il numero è
        minore di 6 aggiungo tanti "0" fino a raggiungere
        lunghezza 6 della stringa*/
      return String.format("%06d", code);
    }
    //Getter per l'attributo name
    public String getName(){
        return name;
    }
    //Setter per l'attributo name
    public void setName(String newName){
        this.name =newName;
    }
    //Getter per l'attributo description
    public String getDescription(){
        return description;
    }
    //Setter per l'attributo description
    public void setDescription(String newDescription){
        this.description=newDescription;
    }
    //Getter per l'attributo vat
    public double getVat(){
        return this.vat;
    }
    //Setter per l'attributo vat
    public void setVat(double newVa){
        this.vat=newVa;
    }

    //Metodo per avere il prezzo base
    public double getPrice(){
        return price;
    }
    //Metodo per calcolare il prezzo compreso di iva
    public double getPriceWithVat(){

        double ivaAmount = price * vat;
        double priceWithVat = price + ivaAmount;
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
                "description=" + description + ", price=" + price + "vat=" + vat +"]";
    }
}
