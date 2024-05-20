package org.learning;

import java.util.Random;

public class Conto {

/*Esercizio 2: Java Bank :bottino:
Creare la classe Conto caratterizzata da:
- numero di conto
- nome del proprietario
- saldo
Usate opportunamente i livelli di accesso (public, private), i costruttori,
i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo
che:- alla creazione di un nuovo conto il saldo sia 0€
- Il codice conto sia accessibile solo in lettura, il proprietario sia accessibile
in lettura e in scrittura e il saldo sia accessibile solo in lettura
- siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare
una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
- altri metodi per ritornare le informazioni del conto e il saldo formattato
Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome
e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o prelevare
una somma di denaro o uscire.Dopo la scelta dell’utente chiediamo quanti soldi
vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto.
Se l’operazione non è valida mostriamo un messaggio di errore. Se l’operazione
va a buon fine mostriamo il saldo attuale del conto. Il menu continua ad apparire
fino a che l’utente sceglie di uscire.*/

    //ATTRIBUTI
    private int accountNumber;
    private String ownerName;
    private double balance;

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
        if (balance > withdrawal && withdrawal > 0){
            this.balance = balance - withdrawal;
            System.out.println(this.balance);
        }else {
            System.out.println("Non ci sono fondi  nel conto o l'importo è <=0");
        }
    }

    // Sovrascrivo il metodo toString()
    @Override
    public String toString() {
        return "Conto[numer account=" + accountNumber + ", proprietario=" + ownerName + ", " +
                "saldo=" + balance + "]";
    }




}
