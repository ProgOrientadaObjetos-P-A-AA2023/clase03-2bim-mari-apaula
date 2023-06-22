package paquete05;

import java.util.ArrayList;
import java.util.Scanner;
import paquete04.EstudianteDistancia;
import paquete04.EstudiantePresencial;
import paquete04.Estudiante;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudientes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        int contador=0, num;      
        
        System.out.println("Ingrese cuantos estudiantes desea ingresar");
        num = entrada.nextInt();
        Estudiante [] estudiantes = new Estudiante [num];
        // inicio de solución
        do {
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();

            switch (tipoEstudiante) {
                case 1 -> {   
                    System.out.println("Ingrese los nombres del estudiante");
                    nombresEst = entrada.nextLine();
                    System.out.println("Ingrese los apellidos del estudiante");
                    apellidosEst = entrada.nextLine();
                    System.out.println("Ingrese la identificación del estudiante");
                    identificacionEst = entrada.nextLine();
                    System.out.println("Ingrese la edad del estudiante");
                    edadEst = entrada.nextInt();
                    System.out.println("Ingrese el número de créditos");
                    numeroCreds = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada créditos");
                    costoCred = entrada.nextDouble();

                    EstudiantePresencial estPresencial = new EstudiantePresencial(
                nombresEst, 
                apellidosEst, 
                identificacionEst, 
                edadEst,
                numeroCreds, 
                costoCred);
                    estudiantes [contador] = estPresencial;
                    contador++;
                }
                case 2 -> {
                    System.out.println("Ingrese los nombres del estudiante");
                    nombresEst = entrada.nextLine();
                    System.out.println("Ingrese los apellidos del estudiante");
                    apellidosEst = entrada.nextLine();
                    System.out.println("Ingrese la identificación del estudiante");
                    identificacionEst = entrada.nextLine();
                    System.out.println("Ingrese la edad del estudiante");
                    edadEst = entrada.nextInt();
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();
                    
                    EstudianteDistancia estudianteD = new EstudianteDistancia(
                            nombresEst, 
                            apellidosEst, 
                            identificacionEst, 
                            edadEst,
                            numeroAsigs, 
                            costoAsig);
                    
                    estudiantes [contador] = estudianteD;
                    contador++;
                }
                default -> {
                    System.out.println("XD");
                }
            }
        } while (contador < estudiantes.length);

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < contador; i++) {
            // 1.  
            estudiantes[i].calcularMatricula();

            System.out.printf("\n\tDatos Estudiante\n"
                    + "%s\n",
                    estudiantes[i]);

        }
    }

}
