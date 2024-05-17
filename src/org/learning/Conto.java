package org.learning;

import java.util.Random;

public class Conto {

    //ATTRIBUTI
    int accountNumber;
    String ownerName;
    double balance;

    //COSTRUTTORE
    public Conto(String ownerName) {
        this.accountNumber = randomNumber();
        this.ownerName = ownerName;
        this.balance = 0;
    }

    //METODI
    //Metodo per leggere il numero di conto
    public int getAccountNumber(){
     return accountNumber;
    }
    //Metodo per leggere il proprietario del conto
    public String getOwnerName(){
        return ownerName;
    }
    //Metodo per modificare il proprietario del conto
    public void setOwnerName(String newOwnerName){
        this.ownerName = newOwnerName;
    }
    //Genero un numero random da 1 a 1000
    public int randomNumber(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(1,1000);
        return randomNumber;
    }
    //Metodo per leggere il saldo
    public double getBalance(){
        return balance;
    }
    //Metodo per versare denaro sul conto
    public void depositMoney(double deposit){
        if (deposit<=0){
            System.out.println("L'importo deve essere un valore positivo");
        }else {
        this.balance = balance + deposit;
        System.out.println(this.balance);
        }
    }
    /*Metodo per prelevare denaro dal conto solo se
     il saldo è maggiore del prelievo*/
    public void withdrawMoney(double withdrawal){
        if (balance > withdrawal){
            this.balance = balance - withdrawal;
            System.out.println(this.balance);
        }else {
            System.out.println("Non ci sono abbastanza fondi nel conto");
        }
    }




    // Sovrascrivo il metodo toString()
    @Override
    public String toString() {
        return "Conto[numer account=" + accountNumber + ", proprietario=" + ownerName + ", " +
                "saldo=" + balance + "]";
    }




}
