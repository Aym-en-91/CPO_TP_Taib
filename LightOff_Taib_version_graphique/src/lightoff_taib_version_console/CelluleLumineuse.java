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
 * La classe CelluleLumineuse représente une cellule lumineuse qui peut être dans l'état
 * "allumée" ou "éteinte".
 */
public class CelluleLumineuse {
    private boolean etat; // true si allumée, false si éteinte

    /**
     * Constructeur par défaut qui initialise l'état de la cellule à "éteinte".
     */
    public CelluleLumineuse() {
        this.etat = false;
    }

    /**
     * Active ou éteint la cellule en inversant son état actuel.
     */
    public void activerCellule() {
        this.etat = !this.etat;
    }

    /**
     * Éteint la cellule en la mettant dans l'état "éteinte" (false).
     */
    public void eteindreCellule() {
        this.etat = false;
    }

    /**
     * Vérifie si la cellule est éteinte.
     *
     * @return true si la cellule est éteinte, false sinon.
     */
    public boolean estEteint() {
        return !this.etat;
    }

    /**
     * Obtient l'état actuel de la cellule.
     *
     * @return true si la cellule est allumée, false sinon.
     */
    public boolean getEtat() {
        return this.etat;
    }

    /**
     * Redéfinition de la méthode toString pour afficher l'état de la cellule.
     *
     * @return "X" si allumée, "O" si éteinte.
     */
    @Override
    public String toString() {
        return (this.etat) ? "X" : "O";
    }
}
