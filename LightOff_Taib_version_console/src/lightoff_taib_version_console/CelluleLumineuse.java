/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_taib_version_console;

/**
 *
 * @author YOGA
 */
/**
 * La classe CelluleLumineuse représente une cellule lumineuse qui peut être
 * dans l'état "allumée" ou "éteinte".
 */
public class CelluleLumineuse {
    private boolean allumee;

    /**
     * Constructeur par défaut. Initialise la cellule comme éteinte.
     */
    public CelluleLumineuse() {
        this.allumee = false;
    }

    /**
     * Vérifie si la cellule est allumée.
     *
     * @return true si la cellule est allumée, sinon false.
     */
    public boolean isAllumee() {
        return allumee;
    }

    /**
     * Allume la cellule.
     */
    public void allumer() {
        this.allumee = true;
    }

    /**
     * Éteint la cellule.
     */
    public void eteindre() {
        this.allumee = false;
    }

    /**
     * Inverse l'état actuel de la cellule (allumée devient éteinte et vice versa).
     */
    public void inverserEtat() {
        this.allumee = !this.allumee;
    }

    /**
     * Réinitialise la cellule en l'éteignant.
     */
    public void reinitialiser() {
        this.allumee = false;
    }
}