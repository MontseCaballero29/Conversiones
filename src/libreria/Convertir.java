/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author Montse Caballero
 */
public class Convertir {
    
    private static double constanteKilogramos = Math.pow(10,3);
    private static double constanteKilogramosLibras = 0.453592; 
    private static double constanteOnzas = 28.3495; 
    private static double constanteSegundosM = 60; 
    private static double constanteSegundosH = 3600; 
    private static double constanteSegundosD = 86400; 
    private static double MPH = 0.2778; 
    private static double KMH = 1.60934;
    private static double gravedad = 9.81; 
    private static double N = 4.44822; 
    private static double Jul = 4.184; 
    private static double eVJ = 0.0000000000000000001602; 
    private static double Vatio = 746; 
    private static double Pascalatm = 101325; 
    private static double Pascalbar = 100000; 
    private static double MHzHz = 1000000; 
    private static double grados = 180/Math.PI; 
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static double ToneladasKilogramos (double num){
      double res = num * constanteKilogramos; 
      return res; 
    }
    public static double LibrasKilogramos (double num){
        double res = num * constanteKilogramosLibras; 
        return res; 
    }
    public static double OnzasGramos ( double num){
        double res = num * constanteOnzas;  
        return res; 
    }
    public static double MinutosSegundos (double tiempo){
        double res = tiempo * constanteSegundosM;  
        return res; 
    }
    public static double HorasSegundos (double tiempo){
        double res = tiempo * constanteSegundosH;   
        return res; 
    }
    public static double DiaSegundos (double tiempo){
        double res = tiempo * constanteSegundosD;   
        return res; 
    }
    public static double KmporhoraMporsegundo(double velocidad){
        double res = velocidad * MPH; 
        return res; 
    }
    public static double MPHaKMH (double velocidad){
        double res = velocidad * KMH; 
        return res; 
    }
    public static double Aceleracion (double g){
        double res = g*gravedad; 
        return res; 
    }
    public static double LibrasFuerzaNewtons (double libras){
        double res = libras*N; 
        return res; 
    }
    public static double CalJul (double cal){
        double res = cal*Jul;  
        return res; 
    }
    public static double eVJul (double eV){
        double res = eV*eVJ; 
        return res; 
    }
    public static double hpVatio (double hp){
        double res = hp*Vatio; 
        return res; 
    }
    public static double atmPa (double atm){
        double res = atm*Pascalatm; 
        return res; 
    }
    public static double barPa (double bar){
        double res = bar*Pascalbar; 
        return res; 
    }
    public static double MHzaHz (double MHz){
        double res = MHz*MHzHz; 
        return res; 
    }
    public static double RadGrados (double rad){
        double res = rad*grados; 
        return res; 
    }
    

    
    
}
