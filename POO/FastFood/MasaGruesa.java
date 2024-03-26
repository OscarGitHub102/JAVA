package POO.FastFood;

public class MasaGruesa extends Pizza
{
    public MasaGruesa(String tamanio, double precio, String nombre, boolean oferta) 
    {
        super(tamanio, precio, nombre, oferta);
    }
    /***********************************************************************/
    public MasaGruesa(String tamanio, double precio, String nombre) 
    {
        super(tamanio, precio, nombre);
    }
}//class MasaGruesa
