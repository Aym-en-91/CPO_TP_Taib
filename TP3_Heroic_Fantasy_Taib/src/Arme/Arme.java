/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *.
 * @author aymen
 */
public abstract class Arme {
    private String nom;
    private int niveau_attaque;
    
   
    public Arme(String nom, int niveau_attaque) {
        this.nom = nom;
        if (niveau_attaque <= 100) {
            this.niveau_attaque = niveau_attaque;
        } else {
            System.out.println("Le niveau d'attaque doit etre égale ou inférieur à 100");
        
        
        }
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau_attaque() {
        return niveau_attaque;
    }
    public String getType(){
        return "Arme";
    }
    public void setNiveau_attaque(int niveau_attaque) {
        if (niveau_attaque <= 100) {
            this.niveau_attaque = niveau_attaque;
        } else {
            System.out.println("Le niveau d'attaque doit etre égale ou inférieur à 100");
        
        
        }
        
    }
     @Override
    public String toString() {
        return "nom: " + nom + " niveau_attaque: " + niveau_attaque;
    }

    
    
    
}

    

