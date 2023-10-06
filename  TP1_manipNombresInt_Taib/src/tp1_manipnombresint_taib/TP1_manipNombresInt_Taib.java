/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
* partie 1 
 */
package tp1_manipnombresint_taib;

/**
 *
 * @author aymen
 */
public class TP1_manipNombresInt_Taib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* partie 1 :Saisie et manipulation de nombres*/
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir deux entiers x, y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x + y;
        int v = x - y;
        int w = x * y;
        int r = x / y;
        int m = x % y;
        System.out.println("somme  x+y=" + z);
        System.out.println("difference  x-y=" + v);
        System.out.println("Produit  xy=" + w);
        System.out.println("quotient x/y=" + r + "et le reste=" + m);
        

    }
    
}
