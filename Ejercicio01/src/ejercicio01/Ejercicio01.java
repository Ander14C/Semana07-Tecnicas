
package ejercicio01;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad;
        
        /*
        Trabajador t = new Trabajador();
        
        System.out.println("Ingrese tipo de documento: ");
        cad = sc.nextLine();
        t.setTipo_doc(cad);
        
        System.out.println("Ingrese numero de documento: ");
        cad = sc.nextLine();
        t.setNro_doc(cad);
        
        System.out.println("Ingrese el apellido paterno: ");
        cad = sc.nextLine();
        t.setApe_paterno(cad);
        
        System.out.println("Ingrese el apellido materno: ");
        cad = sc.nextLine();
        t.setApe_materno(cad);
        
        System.out.println("Ingrese su nombre: ");
        cad = sc.nextLine();
        t.setNombre(cad);
        
        System.out.println("Ingrese fecha de nacimiento: ");
        cad = sc.nextLine();
        t.setFec_nac(cad);
        
        t.VerDatos();
        */
        
        Obrero o1 = new Obrero("C. E");
        
        o1.setJornal(71.5);
        o1.setTipo_doc("DNI");
        o1.setNro_doc("60922611");
        o1.setNombre("Anderson");
        o1.setApe_paterno("Cruzado");
        o1.setApe_materno("Alvarez");
        o1.setFec_nac(LocalDate.parse("2007-06-11"));
        o1.VerDatos();
        
        Empleado e1 = new Empleado("DNI");
        
        e1.setSueldo(4000);
        e1.setTipo_doc("DNI");
        e1.setNro_doc("98765432");
        e1.setNombre("Eduardo");
        e1.setApe_paterno("Perez");
        e1.setApe_materno("Quispe");
        e1.setFec_nac(LocalDate.parse("2004-08-16"));
        e1.VerDatos();
        
        TrabajadorController tc = new TrabajadorController();
        tc.agregarTrabajador(e1);
        tc.agregarTrabajador(o1);
        
        tc.listarTrabajador();
    }
    
}
