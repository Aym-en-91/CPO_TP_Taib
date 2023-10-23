/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.ArrayList;
import Arme.*;
import tp3_heroic_fantasy_taib.etreVivant;


/**
 *
 * @author aymen
 */
public abstract class Personnage implements etreVivant {
    private String nom;
    private int niveau_vie;
    private int niveau_attaque;
    private ArrayList<Arme> armes;
    private Arme Arme_en_Main = null;
    private static int nombre_pers = 0;

    public Personnage(String nom, int niveau_vie) {
        this.nom = nom;
        this.niveau_vie = niveau_vie;
        armes = new ArrayList<Arme>();
        nombre_pers++;
    }
    @Override
    protected void finalize() throws Throwable{
        nombre_pers--;
        super.finalize();
    }
    public void seFatiguer(){
        this.niveau_vie = this.niveau_vie - 10;
    }
    public boolean estVivant(){
        return this.niveau_vie > 0;
     }
    
    public void ajouter_arme(Arme arme){
        if (armes.size() <= 5) {
            armes.add(arme);
        }
        
    }
    public void equiper_arme(String nom){
        for (int i = 0; i < armes.size(); i++) {
            if (armes.get(i).getNom() == nom) {
                Arme_en_Main = armes.get(i);
                System.out.println("L'arme " + armes.get(i).getNom() + "a bien été trouvé et affectée");
                break;
            }
            
        }
    }
    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau_vie() {
        return niveau_vie;
    }
    
    public int getNiveau_attaque() {
        return niveau_attaque;
    }

    public void setNiveau_vie(int niveau_vie) {
        this.niveau_vie = niveau_vie;
    }
    
    

    @Override
    public String toString() {
        return "nom: " + nom + " niveau_vie: " + niveau_vie + " arme en main: " + Arme_en_Main;
    }

    public void estAttaqué(int dégat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
