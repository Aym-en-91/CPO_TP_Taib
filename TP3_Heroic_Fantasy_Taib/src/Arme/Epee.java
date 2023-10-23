/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author aymen
 */
public class Epee extends Arme {
    private int indice_finesse;

    public Epee(String nom, int niveau_attaque, int indice_finesse) {
        super(nom, niveau_attaque);
        if (indice_finesse <= 100) {
            this.indice_finesse = indice_finesse;
        } else {
            System.out.println("L'indice doit etre égale ou inférieur à 100");
        
        
        }
    }

    
    public int getIndice_finesse() {
        return indice_finesse;
    }
    @Override
    public String getType(){
        return "Epee";
    }

    public void setIndice_finesse(int indice_finesse) {
        if (indice_finesse <= 100) {
            this.indice_finesse = indice_finesse;
        } else {
            System.out.println("L'indice doit etre égale ou inférieur à 100");
        
        
        }
    }
    
    
}

    

