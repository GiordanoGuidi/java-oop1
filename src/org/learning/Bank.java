package org.learning;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Inizializzo le variabili
        String action;
        //Chiedo il nome all'utente
        System.out.println("Qual è il suo nome?");
        String guestName=scanner.nextLine();
        //Istanza della classe Conto
        Conto conto1 = new Conto(guestName);
        //Ciclo do while
        do {
        //Ciedo all'utente cosa vuole fare
        System.out.println("Cosa vuole fare?");
        System.out.println("Prelevare denaro");
        System.out.println("Versare denaro");
        System.out.println("Uscire");
        //assegno alla variabile action il valore scelto dall'utente
        action= scanner.nextLine();

        if (!action.equals("Versare denaro")
        && !action.equals("Prelevare denaro")
        && !action.equals("Uscire")){
            System.out.println("Azione non valida");
        }
        else if (action.equals("Prelevare denaro")){
            System.out.println("Quanto vuole prelevare?");
            int withdrawal= Integer.parseInt(scanner.nextLine());
            conto1.withdrawMoney(withdrawal);
        }
        else if (action.equals("Versare denaro")){
            System.out.println("Quanto vuole versare?");
            double deposit = Integer.parseInt(scanner.nextLine());
            conto1.depositMoney(deposit);
        }

        }while (!action.equals("Uscire"));

    }
}
