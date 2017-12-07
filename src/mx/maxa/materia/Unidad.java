package mx.maxa.materia;



public class Unidad implements Comparable<Unidad> {
	
	Double Calificacion;
public Unidad(Double d) {
	Calificacion = d;
}
    public Double getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Double calificacion) {
        Calificacion = calificacion;
    }

    @Override
    public int compareTo(Unidad o) {
    	if (this.Calificacion>o.getCalificacion())return 1;
    	if (this.Calificacion<o.getCalificacion())return -1;
        return 0;
    }
}
