/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author UCF20410
 */
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora();
        c.sumar(7 , 3, 5);
        c.sumar(4 , 5);
        c.sumar(8, 2, 9, 5);
        
        
        Calculadora.restar(7, 3);
        Calculadora.restar(4, 5, 3);
    }
    
}
