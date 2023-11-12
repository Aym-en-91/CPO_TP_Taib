/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_taib_version_console;

import java.util.Random;

/**
 *
 * @author YOGA
 */


/**
 * La classe GrilleDeCellules représente une grille de cellules lumineuses organisées en lignes et colonnes.
 */
public class GrilleDeCellules {
    public CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    public int coups;

    /**
     * Constructeur de la classe GrilleDeCellules.
     *
     * @param nbLignes
     * @param nbColonnes
     */
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
                
        for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[i][j] = new CelluleLumineuse();
        }
    }
        
    }

    /**
     * Éteint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * Active de manière aléatoire une ligne, une colonne ou une diagonale de cellules dans la grille.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3);

        switch (choix) {
            case 0:
                // Activer une ligne aléatoire
                int ligneAleatoire = random.nextInt(nbLignes);
                activerLigneDeCellules(ligneAleatoire);
                break;
            case 1:
                // Activer une colonne aléatoire
                int colonneAleatoire = random.nextInt(nbColonnes);
                activerColonneDeCellules(colonneAleatoire);
                break;
            case 2:
                // Activer une diagonale aléatoire
                if (random.nextBoolean()) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
                break;
            default:
                break;
        }
    }

    /**
     * Mélange la grille de manière aléatoire à partir d'un nombre spécifié de tours.
     *
     * @param nbTours Le nombre de tours de mélange.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();

        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    /**
     * Active toutes les cellules d'une ligne spécifique de la grille.
     *
     * @param idLigne L'identifiant de la ligne à activer.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     * Active toutes les cellules d'une colonne spécifique de la grille.
     *
     * @param idColonne L'identifiant de la colonne à activer.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * Active la diagonale descendante de la grille.
     */
    public void activerDiagonaleDescendante() {
        int minDim = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDim; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Active la diagonale montante de la grille.
     */
    public void activerDiagonaleMontante() {
        int minDim = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDim; i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
    }

    /**
     * Vérifie si toutes les cellules de la grille sont éteintes.
     *
     * @return true si toutes les cellules sont éteintes, false sinon.
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Redéfinition de la méthode toString pour afficher l'état de la grille.
     *
     * @return Une représentation visuelle organisée de la grille.
     */
    @Override
    public String toString() {
        StringBuilder resultat = new StringBuilder();

        // Afficher les indices de colonne
        resultat.append("   | ");
        for (int col = 0; col < nbColonnes; col++) {
            resultat.append(col).append(" | ");
        }
        resultat.append("\n");

        // Afficher la ligne de séparation
        for (int col = 0; col <= nbColonnes; col++) {
            resultat.append("----");
        }
        resultat.append("\n");

        // Afficher l'état de chaque cellule
        for (int row = 0; row < nbLignes; row++) {
            resultat.append(" ").append(row).append(" | ");
            for (int col = 0; col < nbColonnes; col++) {
                resultat.append(matriceCellules[row][col]).append(" | ");
            }
            resultat.append("\n");

            // Afficher la ligne de séparation
            for (int col = 0; col <= nbColonnes; col++) {
                resultat.append("----");
            }
            resultat.append("\n");
        }

        return resultat.toString();
    }

}


