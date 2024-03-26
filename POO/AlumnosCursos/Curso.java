package POO.AlumnosCursos;

public class Curso 
{
    private String      curso;
    private Alumno      arrayAlumnos[];
    private int         posicionUltimo = 0;
    private int         numAlumnos = 0;
    private static int  totalAlumnos = 0;
    
    /*********************************************************/
    public Curso(String curso, int numalumnos)
    {
        this.curso = curso;
        arrayAlumnos = new Alumno[numalumnos];
    }
    /*********************************************************/
    public void nuevoAlumno(String nombre)
    {
        arrayAlumnos[posicionUltimo] = new Alumno (this.curso, nombre);
        posicionUltimo++;
        numAlumnos++;
        totalAlumnos++;
    }

    /*********************************************************/
    public String getCurso() {
        return curso;
    }
    /*********************************************************/

    public void todosLosAlumnos() {
        
        for (int i = 0 ; i < posicionUltimo ; i++)
            System.out.println(arrayAlumnos[i].getNombreAlumno());
    }

    /*********************************************************/
    private static boolean estaEnElCurso (Curso curso, String nombre)
    {
        boolean encontrado = false;
        
        for (int i=0 ; i<curso.posicionUltimo ; i++)
            if (curso.arrayAlumnos[i].getNombreAlumno().equals(nombre)) 
                encontrado = true;
        return encontrado;
    }
    /*********************************************************/
    public static void cursosDelAlumno(Curso c1, Curso c2, String nombre)
    {
        if (estaEnElCurso(c1, nombre))
            System.out.println(nombre + " está matriculado(a) en " + c1.getCurso());

        if (estaEnElCurso(c2, nombre))
            System.out.println(nombre + " está matriculado(a) en " + c2.getCurso());
    }
    
    
}// class Curso
