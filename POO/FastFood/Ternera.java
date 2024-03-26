package POO.FastFood;

public class Ternera extends Burger
{    
    public Ternera(String tipo, double precio, String nombre, boolean oferta) 
    {
        super(tipo, precio, nombre, oferta);
    }
    /*************************************************************/
    public Ternera(String tipo, double precio, String nombre) 
    {
        super(tipo, precio, nombre);
    }
}
