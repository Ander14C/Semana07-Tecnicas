/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author UCF20410
 */
public class Calculadora {
    public void sumar (int a, int b){
        int rpta =a+b;
        System.out.println("la suma es: "+rpta);    
    }
     public void sumar (int a, int b, int c){
        int rpta =a+b+c;
        System.out.println("la suma es: "+rpta);
    }
      public void sumar (int a, int b,int c,int d){
        int rpta =a+b+c+d;
        System.out.println("la suma es: "+rpta);
        
    }
      public static void restar (int a, int b){
        int rpta =a-b;
        System.out.println("la rssta es: "+rpta);
        
    }
            public static void restar (int a, int b, int c){
        int rpta =a-b-c;
        System.out.println("la rssta es: "+rpta);
        
    }
}
