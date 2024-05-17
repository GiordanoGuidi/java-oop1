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
        /*Se la scelta è diversa da quelle richiest stampo
         un messaggio di errore*/
        if (!action.equals("Versare denaro")
        && !action.equals("Prelevare denaro")
        && !action.equals("Uscire")){
            System.out.println("Azione non valida");
        }
        //Se sceglie di prelevare denaro eseguo questo codice
        else if (action.equals("Prelevare denaro")){
            System.out.println("Quanto vuole prelevare?");
            double withdrawal= Double.parseDouble(scanner.nextLine());
            //Eseguo il metodo passando come parametro la variabile withdrawal
            conto1.withdrawMoney(withdrawal);
        }
        //Se sceglie di versare denaro eseguo questo codice
        else if (action.equals("Versare denaro")){
            System.out.println("Quanto vuole versare?");
            double deposit = Double.parseDouble(scanner.nextLine());
            //Eseguo il metodo passando come parametro la variable deposit
            conto1.depositMoney(deposit);
        }

        }while (!action.equals("Uscire"));

    }
}
