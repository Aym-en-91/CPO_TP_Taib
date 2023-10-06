/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_Taib;

/**
 *
 * @author YOGA
 */
public class BouteilleBiere {
    public String nom;
    public float degreAlcool;
    public String brasserie;
    public boolean ouverte;

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        this.nom = unNom;
        this.degreAlcool = unDegre;
        this.brasserie = uneBrasserie;
        this.ouverte = false;
    }
    
    public void lireEtiquette(){
        System.out.println("Bouteille de "+nom+" ("+ degreAlcool+" degres) \nBrasserie : " + brasserie);
    
    
    }
    public boolean Décapsuler(){
        if (ouverte == true) {
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }else{
            ouverte = true;
            return true;
        }
    
    
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
    
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aymen
 */
public class BouteilleBiere {
    
}
