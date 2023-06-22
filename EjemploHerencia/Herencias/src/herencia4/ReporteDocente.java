/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    
    public ReporteDocente(String miCodigo, ArrayList<Docente> miLista) {
        super(miCodigo);
        lista = miLista;
        
    }

    public ReporteDocente(ArrayList<Docente> lista, String c) {
        super(c);
        this.lista = lista;
    }
    
    

    public void establecerPromedioSueldos() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma +lista.get(i).getSueldo();
        }
        promedioSueldos = suma;
    }

    public void establecerLista(ArrayList<Docente> l) {
        this.lista = l;
    }
    
    public double obtenerPromedioSueldos() {
        establecerPromedioSueldos();
        return promedioSueldos;
    }
    
    public ArrayList<Docente> obtenrLista() {
        return lista;
    }
    
    @Override
    public String toString(){
        String cadena = "Reporte Docente\n";
        
        cadena =String.format("%sCODIGO: %s\n", cadena, codigo);
        cadena =String.format("%sLisata Docentes\n", cadena);
        
        for (int i = 0; i < obtenrLista().size(); i++) {
            Docente d = obtenrLista().get(i);
            cadena = String.format("%sNombre: %s\nSuledo: %.1f\n", 
                    cadena, d.getNombre(),  d.getSueldo());
            
        }
        cadena =String.format("%sEl promedio de sueldos es: %.3f\n", cadena, obtenerPromedioSueldos());


        
        return cadena;
    }

}
