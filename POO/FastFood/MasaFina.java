package POO.FastFood;

public class MasaFina extends Pizza
{
    public MasaFina(String tamanio, double precio, String nombre, boolean oferta) 
    {
        super(tamanio, precio, nombre, oferta);
    }
    /***********************************************************************/
    public MasaFina(String tamanio, double precio, String nombre) 
    {
        super(tamanio, precio, nombre);
    }
}//class MasaFina
