/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice2;

import java.util.Scanner;

/**
 *
 * @author aymen
 */
public class Exercice2 {

    /**
     * @param args the command line arguments
     */
  public static double CelciusVersKelvin (double tCelcius){
      tCelcius = tCelcius + 273.15 ;
      return tCelcius ;
  }
  public static double KelvinVersCelcius(double Kelvin){
  Kelvin= Kelvin- 273.15;
  return Kelvin;
 
}
  public static double FarenheitVersCelcius( double Farentheit  ){
      Farentheit = (Farentheit - 32)*5/9;
      return Farentheit ;
  }
  public static double CelciusVersFarenheit(double celcius){
      celcius = (celcius *9/5) +32 ;
      return celcius ;
      
  }
      public static double KelvinVersFarenheit( double A){
          A=(A-273.15)*9/5+32;
          return A ; 
         
      } 
       public static double FarenheitVersKelvin(double Kelvin){
           Kelvin = (Kelvin -32) *5/9 +273.15 ;
           return Kelvin ;
          
       }

      
  
  
  
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir une valeur réelle 
        System.out.println("Veuillez saisir une valeur réelle (double) : ");

        //  lire la valeur entrée par l'utilisateur
        double valeurDouble = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius  \n 3)De celcius vers Farenheit \n 4) De Kelvin vers Farenheit 5) De Farenheit vers Celcius \n De 6) De Farenheit vers Kelvin");
        int B  ;
        B = sc.nextInt();
        if (B==1 ) {
            CelciusVersKelvin(valeurDouble);
           System.out.println( CelciusVersKelvin(valeurDouble));
        }
         
        if(B==2) { 
            System.out.println( KelvinVersCelcius(valeurDouble));
            
        }
        if (B==3){
            System.out.println( CelciusVersFarenheit(valeurDouble));
            
            
        }
        if (B==4){
             System.out.println( KelvinVersFarenheit(valeurDouble));
        }
            
         if (B==5){ 
             System.out.println( FarenheitVersCelcius(valeurDouble));
             
         }
         if (B==6){
             System.out.println( FarenheitVersKelvin(valeurDouble));
             
         }
       
    }
}