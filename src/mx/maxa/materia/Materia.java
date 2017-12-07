package mx.maxa.materia;

import java.util.LinkedList;


public class Materia {
    String Nombre;
    Double promedio;
    LinkedList<Unidad> Unidades;
    public Materia() {
    	promedio =0d;
    	Unidades = new LinkedList<>();
    	Nombre ="";
        }
    public Materia(String n) {
    	promedio =0d;
    	Unidades = new LinkedList<>();
	Nombre = n;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void addUnidad(Double d){
    	Unidades.add(new Unidad(d));
    }
    public int getNumUnidades(){
    	return Unidades.size();
    }
    //obtiene el promedio de las unidades
    public Double getPromedio(){
    	double sum =0;
    	for (Unidad unidad : Unidades) 
			sum+= unidad.getCalificacion();
		return sum/Unidades.size();
    }
    // imprime las unidades
    public void printUnidades(){
    	for (Unidad unidad : Unidades) {
			System.out.print(unidad.getCalificacion()+" ");
		}
    	System.out.println();
    }
    

   

  
}
