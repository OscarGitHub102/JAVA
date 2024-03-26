package POO.FastFood;

public class Plato 
{
    private static int idSiguiente = 100;
    private int id;
    private double precio;
    private String nombre;
    private boolean oferta;

    public Plato(double precio, String nombre, boolean oferta) 
    {
        this.precio = precio;
        this.nombre = nombre;
        this.oferta = oferta;
        this.id = this.idSiguiente;
        this.idSiguiente++;
    }
    /******************************************************************/
    public Plato(double precio, String nombre) 
    {
        this.precio = precio;
        this.nombre = nombre;
        this.id = this.idSiguiente;
        this.idSiguiente++;
    }
    /******************************************************************/
    public  int getId() {
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getIdSiguiente() {
        return idSiguiente;
    }

    public static void setIdSiguiente(int idSiguiente) {
        Plato.idSiguiente = idSiguiente;
    }

    @Override
    public String toString() 
    {
        return "Plato{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", oferta=" + oferta + '}';
    }
}//class Plato
