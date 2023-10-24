/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_taib;

import Arme.Baton;
import Arme.Epee;
import Personnages.Guerrier;
import Personnages.Magicien;

/**
 *
 * @author aymen
 */
public class TP3_Heroic_Fantasy_Taib {

    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        
        Magicien magicien = new Magicien(false, "magicien1", 40);
        Guerrier guerrier = new Guerrier(true, "guerrier1", 40);
        
        magicien.ajouter_arme(charme);
        magicien.ajouter_arme(durandal);
        
        guerrier.ajouter_arme(excalibur);
        guerrier.ajouter_arme(chene);
        
        magicien.equiper_arme("Charme");
        guerrier.equiper_arme("Excalibur");
        
        guerrier.attaquer(magicien);
        
        System.out.println(guerrier);
        System.out.println(magicien);
        
        magicien.attaquer(guerrier);
        
        System.out.println(guerrier);
        System.out.println(magicien);
        
        if (magicien.estVivant()) {
            System.out.println("Le magicien est vivant");
        }else {
            System.out.println("Le magicien est mort");
        }
        if (guerrier.estVivant()) {
            System.out.println("Le guerrier est vivant");
        } else {
            System.out.print("le guerrier est mort");
        }
        
        
    }
}
