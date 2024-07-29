/*
* Scrivi un programma che simuli una semplice calcolatrice in grado di eseguire operazioni di addizione, sottrazione, moltiplicazione e divisione su due numeri. Il programma dovrebbe:

Richiedere all'utente di inserire due numeri.
Richiedere all'utente di scegliere un'operazione (addizione, sottrazione, moltiplicazione, divisione).
Eseguire l'operazione scelta e visualizzare il risultato.
Gestire le seguenti eccezioni:
InputMismatchException: quando l'utente inserisce un input non valido per i numeri.
ArithmeticException: quando si verifica un errore aritmetico, come la divisione per zero.
UnknownOperationException: una tua eccezione personalizzata per gestire operazioni non valide.*/

import exceptions.UnknownOperationExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownOperationExceptions {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Inserisci il primo numero");
            double num1 = scanner.nextDouble();

            System.out.println("Inserisci il secondo numero");
            double num2 = scanner.nextDouble();
            Calcolatrice c1 = new Calcolatrice(num1, num2);
            System.out.println("Inserisci operazione da svolgere");
            char operazione = scanner.next().charAt(0);

            Double result = c1.Calcola(operazione);
            System.out.println("Il risultato è: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Valore non valido");
        } catch (ArithmeticException e) {
            System.out.println("Errore aritmetico");

        } finally {
            scanner.close();
            System.out.println("Calcolatrice terminata");
        }


    }


}
