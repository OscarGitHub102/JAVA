package POO.FastFood;

public class Buey extends Burger
{    
    public Buey(String tipo, double precio, String nombre, boolean oferta) 
    {
        super(tipo, precio, nombre, oferta);
    }
    /*************************************************************/
    public Buey(String tipo, double precio, String nombre) 
    {
        super(tipo, precio, nombre);
    }
}//class Buey
