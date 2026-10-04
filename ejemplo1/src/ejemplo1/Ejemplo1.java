/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author UCF20410
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto a1;
        a1 = new Auto();
       
        a1.color="rojo";
        a1.marca="toyota";
        a1.verDatos();
        
        Auto a2;
        a2 = new Auto();
        a2.color="verde";
        a2.marca="audi";
        a2.verDatos();
        
        Botiquin b1;
        b1 = new Botiquin();
        
        b1.medicamentos = "amoxicilina";
        b1.alcohol = "hisopropilico";
        b1.verDatos();
         
    }
    
}
