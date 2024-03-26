package POO.FastFood;

public class Pizza extends Plato
{
    private String tamanio; 
    
    /*************************************************************/

    public Pizza(String tamanio, double precio, String nombre, boolean oferta) 
    {
        super(precio, nombre, oferta);
        this.tamanio = tamanio;
    }
    /***************************************************************/
    public Pizza(String tamanio, double precio, String nombre)
    {
        super(precio, nombre);
        this.tamanio = tamanio;
    }
}//class Pizza
