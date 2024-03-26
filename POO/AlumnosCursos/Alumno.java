package POO.AlumnosCursos;

public class Alumno 
{
    private String      nombreAlumno;
    private String      curso;
        
    /**********************************************************/
    public Alumno(String curso, String nombre) 
    {
        this.curso = curso;
        this.nombreAlumno = nombre;
    }
    /**********************************************************/
    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", curso=" + curso + '}';
    }
    /**********************************************************/
    public String getNombreAlumno() {
        return nombreAlumno;
    }
    /**********************************************************/
    
    
}// class Alumno
