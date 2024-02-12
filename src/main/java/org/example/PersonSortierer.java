package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonSortierer {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

        System.out.println("1 ... Person eingeben\n" +
                "2 ... Liste nach Nachnamen / Vornamen sortiert ausgeben\n" +
                "3 ... Liste nach Alter absteigend ausgeben\n" +
                "4 ... Liste nach Größe aufsteigend ausgeben\n" +
                "0 ... Programm beenden");

        System.out.println("Geben Sie ihre gewünschte Zahl ein");
        int eingabe= sc.nextInt();


        do {
            if (eingabe==0){
                System.out.println("Vorname: ");
                String vorname= sc.next();
                System.out.println("Nachname: ");
                String nachname= sc.next();
                System.out.println("Geburtsdatum: ");
                String gb= sc.next();
                System.out.println();
            }
        }
    }


}
