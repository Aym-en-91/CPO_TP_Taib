/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Arme.*;
/**
 *
 * @author aymen
 */
public class Guerrier extends Personnage {
    private boolean cheval;
    public static int nombre_guerriers = 0;

    public Guerrier(boolean cheval, String nom, int niveau_vie) {
        super(nom, niveau_vie);
        this.cheval = cheval;
        nombre_guerriers++;
    }
    @Override
    protected void finalize() throws Throwable{
        nombre_guerriers--;
        super.finalize();
    }
    public boolean isCheval() {
        return cheval;
    }
    public void attaquer(Personnage pers){
        int dégat = this.getArme_en_Main().getNiveau_attaque();
        if (this.getArme_en_Main().getType() == "Epee") {
            dégat = dégat * ((Epee) this.getArme_en_Main()).getIndice_finesse();
        }
        pers.estAttaqué(dégat);
        this.seFatiguer();
    
    }
    @Override
    public void estAttaqué(int points){
        if (this.isCheval()) {
            this.setNiveau_vie(this.getNiveau_vie() - (points/2));
            
        }
        else
        {
            this.setNiveau_vie(this.getNiveau_vie() - (points));
        }
    }
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    
    
}

    

