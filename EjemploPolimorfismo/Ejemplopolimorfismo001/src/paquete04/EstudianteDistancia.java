/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

public class EstudianteDistancia extends Estudiante {
    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
    */ 
    
    int numeroAsignaturas;
    double costoAsignatura;
    
    public EstudianteDistancia(String nombresEstudiante, String 
            apellidosEstudiante, String identificacionEstudiante, 
            int edadEstudiante, int numeroAsignaturas, 
            double costoAsignatura) {
        super(nombresEstudiante, apellidosEstudiante, 
                identificacionEstudiante, edadEstudiante);
        this.numeroAsignaturas = numeroAsignaturas;
        this.costoAsignatura = costoAsignatura;
    }
    //  Métodos establecer y calcular para los datos o atributos de la clase
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    @Override
    public void calcularMatricula(){
        matricula = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%sNumero asiganturas: %d\n"
                + "Costo asigantura: %.2f\n"
                + "Matricula: %.2f\n",
                super.toString(),
                obtenerNumeroAsignaturas(), 
                obtenerCostoAsignatura(),
                obtenerMatricula());       
        
        return cadena;
    }
}
