
package ejercicio01;

public class Obrero extends Trabajador{ //El extends es para conectar la clase obrero(hijo) a la clase Trabajador(padre) lo mismo con empleado
    private double jornal;

    public Obrero(String tipo_doc) {
        super(tipo_doc);
    }
   
    public double getJornal() {
        return jornal;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }
    
    public void calcularJornadaMensual(int diastrabajados){ //Este metodo sirve para calcular los dias trabajados
        double rpta = diastrabajados * this.jornal; //
        System.out.println("El jornal mensual es: " + rpta);
    }

    @Override
    public void VerDatos() { //Para agregar un override se da anticlip, Inser code,Override metod y selecionas el ver datos(o el que te pidan)  
        System.out.println(" OBRERO TIPODOC: "+ this.tipo_doc +
                " NRODOC: "+ this.nro_doc +
                " NOMBRE: "+ this.nombre +
                " PATERNO "+ this.ape_paterno +
                " MATERNO: "+this.ape_materno +
                " FECHA DE NACIMIENTO: "+ this.fec_nac + 
                " JORNAL: "+this.jornal);
    }
    
}
