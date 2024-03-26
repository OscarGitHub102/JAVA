package POO.FastFood;

public class Burger extends Plato
{
    private String tipo;
    
    /*************************************************************/
    
    public Burger(String tipo, double precio, String nombre, boolean oferta) 
    {
        super(precio, nombre, oferta);
        this.tipo = tipo;
    }
    /*************************************************************/
    public Burger(String tipo, double precio, String nombre) 
    {
        super(precio, nombre);
        this.tipo = tipo;
    }
}//class Burger

