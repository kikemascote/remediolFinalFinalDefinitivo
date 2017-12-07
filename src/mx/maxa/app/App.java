package mx.maxa.app;

import mx.maxa.alumno.Alumno;
import mx.maxa.tree.Arbol;

public class App {
    public static void main(String[] args) {
      Arbol<Alumno> rank = new Arbol<>();
    	
    	//primero crea un alumno
         Alumno kike = new Alumno("kike");
        //luego añade materias;
         kike.addMateria("programacion");
         kike.addMateria("base de datos");
        //y despues calificaciones a cada materia
         kike.setCalif("programacion", 10d);
         kike.setCalif("programacion", 8d);
         kike.setCalif("programacion", 7d);
         kike.setCalif("base de datos",10d);
         kike.setCalif("base de datos",10d);
         kike.setCalif("base de datos",10d);
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
        milton.setCalif("base de datos",10d);
        milton.setCalif("base de datos",1d);
        milton.setCalif("base de datos",10d);
        
        rank.add(kike);
        rank.add(milton);
        
        rank.PrintInorder();
         
         
         
    }
}
