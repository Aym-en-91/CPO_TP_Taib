/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_Taib;

import java.util.Scanner;

/**
 *
 * @author YOGA
 */
public class TP2_convertisseurObjet_Taib {

    public static void main(String[] args) {
        Convertisseur Convert1 = new Convertisseur();
        Convertisseur Convert2 = new Convertisseur();
        
        Convert1.CelciusVersFarenheit(35);
        Convert1.FarenheitVersCelcius(120);
        System.out.println(Convert1.toString());
        Convert2.CelciusVersFarenheit(40);
        Convert2.FarenheitVersCelcius(115);
        Convert2.KelvinVersCelcius(250);
        System.out.println(Convert2.toString());
        
        
        Convertisseur Convert3 = new Convertisseur();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une valeur : ");
        float temperature = scanner.nextFloat();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");

        int choix = scanner.nextInt();

        float resultat = 0;

        switch (choix) {
            case 1:
                resultat = Convert3.CelciusVersKelvin(temperature);
                break;
            case 2:
                resultat = Convert3.KelvinVersCelcius(temperature);
                break;
            case 3:
                resultat = Convert3.FarenheitVersCelcius(temperature);
                break;
            case 4:
                resultat = Convert3.CelciusVersFarenheit(temperature);
                break;
            case 5:
                resultat = Convert3.KelvinVersFarenheit(temperature);
                break;
            case 6:
                resultat = Convert3.FarenheitVersKelvin(temperature);
                break;
            default:
                System.out.println("Choix invalide.");
                System.exit(1);
        }

        System.out.println(temperature + " degré(s) est égal à " + resultat + " degré(s).");
        
    }
}
