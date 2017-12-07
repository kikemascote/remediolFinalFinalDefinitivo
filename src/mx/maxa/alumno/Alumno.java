package mx.maxa.alumno;

import mx.maxa.materia.Materia;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;

public class Alumno implements Comparable<Alumno>, Comparator<Alumno> {
    String Nombre;
    Double Promedio;
    LinkedList<Materia> Lista;

    public Alumno() {
        Promedio = 0d;
        Lista = new LinkedList<>();
        Nombre = "";
    }

    public Alumno(String n) {
        Promedio = 0d;
        Lista = new LinkedList<>();
        Nombre = n;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getPromedio() {
        return Promedio;
    }

    public void addMateria(String m) {
        Lista.add(new Materia(m));
    }

    //obtiene el promedio de todoo
    public Double getProm() {
        double sum = 0;
        for (Materia materia : Lista)
            sum += materia.getPromedio();
        return sum / Lista.size();
    }

    //obtiene el promedio de la materia espesifica
    public double getProm(String mat) {
        Materia m = null;
        for (Materia materia : Lista)
            if (materia.getNombre().equals(mat))
                m = materia;
        if (m != null) {
            return m.getPromedio();
        }
        return 0d;
    }

    // pone calificacion en materia
    public void setCalif(String materi, Double unida) {
        for (Materia materia : Lista) {
            if (materia.getNombre().equals(materi)) {
                materia.addUnidad(unida);
                return;
            }
        }

    }

    //imprime todas las calificaciones de una materia
    public boolean getCalif(String materi) {
        Materia m = null;
        for (Materia materia : Lista)
            if (materia.getNombre().equals(materi))
                m = materia;
        if (m != null) {
            m.printUnidades();
            return true;
        }
        return false;
    }

    //imprime todas las calificaciones de todas las materias
    public void printCalif() {
        for (Materia materia : Lista) {
            System.out.println(materia.getNombre());
            materia.printUnidades();
        }
    }


    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.compareTo(o2);
    }

    @Override
    public int compareTo(Alumno o) {
        if (Objects.equals(this.getProm(), o.getProm())) return 0;
        else if (this.getProm() > o.getProm()) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return "Alumno [Nombre: " + Nombre + ", Promedio: " + getProm() + "]";
    }

}
