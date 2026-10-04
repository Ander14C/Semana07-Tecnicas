/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

import java.util.ArrayList;

/**
 *
 * @author UCF20410
 */
public class TrabajadorController {
    ArrayList<Trabajador> listartrabajador = new ArrayList();
    
    public void agregarTrabajador(Trabajador nuevotrabajador){
        listartrabajador.add(nuevotrabajador);
    }
    
    public void listarTrabajador(){
        System.out.println("La lista de trabajadores es: ");
        for (int i=0; i<listartrabajador.size(); i++){
            Trabajador t = listartrabajador.get(i);
            t.VerDatos();
            if(t instanceof Empleado){ //esto es dow casting
                Empleado x = (Empleado)t;
                x.calcularsueldoMensual(5);
            }
            else if(t instanceof Obrero){
                Obrero x = (Obrero)t;
                x.calcularJornadaMensual(25);
            }
        }
    }
}
