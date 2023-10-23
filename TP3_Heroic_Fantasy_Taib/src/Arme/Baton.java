/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author aymen
 */
public class Baton extends Arme {
    private int age;

    public Baton(String nom, int niveau_attaque, int age) {
        super(nom, niveau_attaque);
        if (age <= 100) {
            this.age = age;
        } else {
            System.out.println("L'age doit etre égale ou inférieur à 100");
        
        
        }
        
    }
    @Override
    public String getType(){
        return "Baton";
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 100) {
            this.age = age;
        } else {
            System.out.println("L'age doit etre égale ou inférieur à 100");
        
        
        }
    }
    
  
    
}
