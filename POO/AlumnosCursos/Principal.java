package POO.AlumnosCursos;

public class Principal 
{
    public static void main(String[] args) 
    {
        Curso cursoJava     = new Curso("Java",30);
        Curso cursoC        = new Curso("C",40);
        
        cursoJava.nuevoAlumno("Miguel Estrogoff");
        cursoJava.nuevoAlumno("Pamela Anderson");
        cursoC.nuevoAlumno("Pamela Anderson");
        cursoJava.nuevoAlumno("Lope de Vega");
        
        System.out.println("*** Alumn@s del curso de Java ***");
        cursoJava.todosLosAlumnos();
        System.out.println("");
        
        System.out.println("*** Alumn@s del curso de C ***");
        cursoC.todosLosAlumnos();
        System.out.println("");
        
        System.out.println("*** Cursos la estudiante Pamela Anderson ***");
        Curso.cursosDelAlumno(cursoJava, cursoC,"Pamela Anderson");
     
    }   
}