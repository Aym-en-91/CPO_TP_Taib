/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Arme.*;
/**
 *
 * @author aymenss
 */
public class Magicien extends Personnage {
    private boolean confirme;
    public static int nombre_magiciens = 0;

    public Magicien(boolean confirme, String nom, int niveau_vie) {
        super(nom, niveau_vie);
        this.confirme = confirme;
        nombre_magiciens++;
    }
    @Override
    protected void finalize() throws Throwable{
        nombre_magiciens--;
        super.finalize();
    }
    
    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
     public void attaquer(Personnage pers){
        int dégat = this.getArme_en_Main().getNiveau_attaque();
        if ("Baton".equals(this.getArme_en_Main().getType())) {
            dégat = dégat * ((Baton) this.getArme_en_Main()).getAge();
        }
        pers.estAttaqué(dégat);
        this.seFatiguer();
    
    }
    public void estAttaqué(int points){
        if (this.isConfirme()) {
            this.setNiveau_vie(this.getNiveau_vie() - (points/2));
            
        }
        else
        {
            this.setNiveau_vie(this.getNiveau_vie() - (points));
        }
    }
    
    
}

    

