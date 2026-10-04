
package ejercicio01;

public class Empleado extends Trabajador{
    private double sueldo;

    public Empleado(String tipo_doc) {
        super(tipo_doc);
    }
 
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void calcularsueldoMensual(int nrofaltas){
        double rpta = this.sueldo - ((this.sueldo/30)*nrofaltas); //Codigo para calcular el nro de faltas y sacar su mensualidad
        System.out.println("Su sueldo mensual es: "+ rpta);
    }

    @Override
    public void VerDatos() {
        System.out.println(" OBRERO TIPODOC: "+ this.tipo_doc +
                " NRODOC: "+ this.nro_doc +
                " NOMBRE: "+ this.nombre +
                " PATERNO "+ this.ape_paterno +
                " MATERNO: "+this.ape_materno +
                " FECHA DE NACIMIENTO: "+ this.fec_nac + 
                " SUELDO: "+this.sueldo);
    }
    
}
