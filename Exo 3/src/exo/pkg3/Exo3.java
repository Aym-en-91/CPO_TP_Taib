/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*taib aymen 
*tp0
*exo3
 */
package exo.pkg3;

/**
 *
 * @author aymen
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public class Calculatrice {

        @SuppressWarnings("empty-statement")

        public static void main(String[] args) {

            int nombre1;

            int nombre2;
            int choixOperateur;
            int resultat = 0;

            Scanner scanner = new Scanner(System.in);

            // Affichage du menu des opérations
            System.out.println(
                    System.out.println
            "\nChoisissez une opération :\n" +
                "1) Addition\n" +
                
               
"2) Soustraction\n" +
                "3) Multiplication\n" +
                "4) Division\n" +
                "5) Modulo");

        choixOperateur = scanner.nextInt();

            choixOperateur = scanner.nextInt


            choixOperateur choixOper // Vérification que le choix est valide
        
       
            while (choixOperateur > 5 || choixOperateur < 1) {
                System.out.println(
                        System.out.println

            System.out

           
                "Erreur : Veuillez saisir un chiffre entre 1 et 5");
            choixOperateur = scanner.nextInt();
            }

            System.out.println(
                    choixOperateur = scanner.nextInt();
        }

        System choixOperateur = scanner.nextInt

        choixOperateur
        "\nEntrez le premier nombre :");
        nombre1  = scanner.nextInt();

        System.out.println (
                nombre1 
        = scanner.nextInt();


       
        "\nEntrez le deuxième nombre :");
        nombre2  = scanner.nextInt();

        nombre2  = scanner.nextInt();

        nombre2  = scanner.nextInt

        nombre2 // Calcul en fonction de l'opération choisie
        if (choixOperateur

        
            == 1) {
            resultat = nombre1 + nombre2;
        }

        resultat  = nombre1 + nombre2;
    }

    resultat  = nombre1 + nombre2;

    resultat  = nombre1

    resultat  =

           
    if (choixOperateur

    
        == 2) {
            resultat = nombre1 - nombre2;
    }

    resultat  = nombre1 - nombre

    resultat  = nombre1
            - resultat =

           
    if (choixOperateur

    
        == 3) {
            resultat = nombre1 * nombre2;
    }

    resultat  = nombre1 * nombre2;
}

resultat = nombre1 * nombre2;
       

            resultat = nombre1 * nombre2;

            resultat = nombre1 *

            resultat = nombre1
if (choixOperateur == 4) {
            // Vérification de la division par zéro
            if (nombre2 != 0) {
                resultat = nombre1 / nombre2;
            } 
                resultat = nombre1 / nombre2;
           

                resultat = nombre1 / nombre2

                resultat = nombre1
else {
                System.out.println(
                System
"Erreur : Division par zéro impossible.");
                System.exit(
                System.exit

               
0);
            }
        }
        
            }
       
if (choixOperateur == 5) {
            // Vérification de la division par zéro
            if (nombre2 != 0) {
                resultat = nombre1 % nombre2;
            } else {
                System.out.println("Erreur : Division par zéro impossible.");
                System.exit(
               
0);
            }
        }

        System.out.println(
            }
        }

        System.out.println

            }
        }

       

            }
       
"\nLe résultat est : " + resultat);
    }
}
