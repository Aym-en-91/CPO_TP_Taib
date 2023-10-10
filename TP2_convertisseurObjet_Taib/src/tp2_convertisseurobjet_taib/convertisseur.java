package com.mycompany.tp2_convertisseurobjet_Taib;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YOGA
 */
public class Convertisseur {
    private int NbConversions;
    public Convertisseur(){
        NbConversions = 0;
    
    }
    public  float CelciusVersKelvin(float tCelcius) {
        NbConversions= NbConversions + 1;
        return tCelcius + (float)273.15;
    }

    public  float KelvinVersCelcius(float tKelvin) {
        NbConversions= NbConversions + 1;
        return tKelvin - (float)273.15;
    }

    public  float FarenheitVersCelcius(float tFarenheit) {
        NbConversions= NbConversions + 1;
        return (tFarenheit - 32) * 5 / 9;
    }

    public  float CelciusVersFarenheit(float tCelcius) {
        NbConversions= NbConversions + 1;
        return (tCelcius * 9 / 5) + 32;
    }

    public  float KelvinVersFarenheit(float tKelvin) {
        NbConversions= NbConversions + 1;
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public  float FarenheitVersKelvin(float tFarenheit) {
        NbConversions= NbConversions + 1;
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
    

    @Override
    public String toString() {
        return "nb de conversions"+ NbConversions;
    }
    
    
    
}
