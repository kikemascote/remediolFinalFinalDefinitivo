package mx.maxa.app;

import mx.maxa.alumno.Alumno;
import mx.maxa.node.node;
import mx.maxa.tree.Arbol;

public class App {
    public static void main(String[] args) {
        Arbol<Alumno> rank = new Arbol<>();
        node<String>[] mat = new node[4];
        for (int i = 0; i < mat.length; i++) {
            mat[i] = new node<>();
        }
        mat[0].setValue("Estructuras de Datos");
        mat[1].setValue("Bases de Datos");
        mat[2].setValue("Desarrollo de Aplicaciones");
        mat[3].setValue("Ingenieria de Software");
        mat[0].setRight(mat[1]);
        mat[1].setRight(mat[2]);
        mat[2].setRight(mat[3]);

        Alumno[] alumno;
        alumno = new Alumno[5];
        for (int i = 0; i < alumno.length; i++) {
            alumno[i] = new Alumno();
            alumno[i].setNombre("Juan " + i);
            for (int j = 0; j < mat.length; j++) {
                alumno[i].addMateria(mat[j].getValue());
                alumno[i].setCalif(mat[j].getValue(), (Double) Math.random() * 11);
            }
        }


        //primero crea un alumno
        Alumno kike = new Alumno("kike");
        //luego añade materias;
        kike.addMateria("programacion");
        kike.addMateria("base de datos");
        //y despues calificaciones a cada materia
        kike.setCalif("programacion", 10d);
        kike.setCalif("programacion", 8d);
        kike.setCalif("programacion", 7d);
        kike.setCalif("base de datos", 10d);
        kike.setCalif("base de datos", 10d);
        kike.setCalif("base de datos", 10d);
       /*  
        System.out.println( kike.getProm("progra"));
        System.out.println( kike.getProm("base de datos"));
        System.out.println(  kike.getProm());
        */

        Alumno milton = new Alumno("milton");


        milton.addMateria("progra");
        milton.addMateria("base de datos");

        milton.setCalif("progra", 1d);
        milton.setCalif("progra", 8d);
        milton.setCalif("progra", 7d);
        milton.setCalif("base de datos", 10d);
        milton.setCalif("base de datos", 1d);
        milton.setCalif("base de datos", 10d);

        for (int i = 0; i < alumno.length; i++) {
            rank.add(alumno[i]);
        }
        rank.add(kike);
        rank.add(milton);

        rank.PrintInorder();


    }
}
