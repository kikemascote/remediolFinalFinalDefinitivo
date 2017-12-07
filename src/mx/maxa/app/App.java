package mx.maxa.app;

import mx.maxa.alumno.Alumno;
import mx.maxa.node.node;
import mx.maxa.tree.Arbol;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Arbol<Alumno> rank = new Arbol<>();
        node<String>[] mat = new node[4];
        Random rand = new Random();
        String[] lista = new String[10];
        lista[0]="Juan Camaney";
        lista[1]="Carlos Esparza";
        lista[2]="Milton Batres";
        lista[3]="Andrik Miranda";
        lista[4]="Gaby Melendez";
        lista[5]="Arturo Herrera";
        lista[6]="Jorge Nitales";
        lista[7]="Alma Marcela Silva de Alegria";
        lista[8]="Jalil Fierro Pariente";
        lista[9]="Ricardo Ricon";


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
            alumno[i].setNombre(lista[rand.nextInt(10)]);
            for (int j = 0; j < mat.length; j++) {
                alumno[i].addMateria(mat[j].getValue());
                for (int k = 0; k < rand.nextInt(5)+1; k++) alumno[i].setCalif(mat[j].getValue(), ((double) rand.nextInt(10)+1));
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
        System.out.println(rank.deepSearch(alumno[1]).getValue().getNombre());
        alumno[1].printCalif();
        System.out.println("\n\nCalifas de "+alumno[3].getNombre()+" de la materia "+mat[1].getValue());
        alumno[3].getCalif(mat[1].getValue());


    }
}
