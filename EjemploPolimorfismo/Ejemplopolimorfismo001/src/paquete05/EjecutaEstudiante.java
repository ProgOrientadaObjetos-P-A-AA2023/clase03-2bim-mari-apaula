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
        de docentes. 
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
        String continuar;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

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
                    estPresencial.calcularMatricula();
                    estudiantes.add(estPresencial);
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
                    estudianteD.calcularMatricula();
                    
                    estudiantes.add(estudianteD);
                }
                default -> {
                    System.out.println("XD");
                }
            }
            entrada.nextLine();
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar");
            continuar = entrada.nextLine();
        } while (continuar.equals("S"));

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("\n\tDatos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
