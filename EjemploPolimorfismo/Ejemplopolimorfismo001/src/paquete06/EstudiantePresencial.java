/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

public class EstudiantePresencial extends Estudiante{
    /*1.  Declarar
        numeroCreditos: Entero 
        costoCredito: Real 
        */
    int numeroCreditos;
    double costoCredito;
    
    public EstudiantePresencial(String n, String a, String i, int e,int num, 
            double cost) {
        
        super(n, a, i, e);
        numeroCreditos = num;
        costoCredito = cost;
    }
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  
    // Se implementa el método abstracto declarado en la superclase,
    // bajo las condiciones propias de la subclase
    @Override
    public void calcularMatricula(){
        matricula = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%sNumero creditos: %d\n"
                + "Costo creditos: %.2f\n"
                + "Matricula: %.2f\n",
                super.toString(),
                obtenerNumeroCreditos(), 
                obtenerCostoCredito(),
                obtenerMatricula());       
        
        return cadena;
    }
}
