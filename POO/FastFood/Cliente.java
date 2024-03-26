package POO.FastFood;

public class Cliente 
{
    private String  nombre;
    private Plato plato1;
    private Plato plato2;
    private Plato plato3;
    private int contadorPlatos = 1;
    
    /*********************************************************************/
    /*********************************************************************/
    public Cliente(String nombre)
    {
        this.nombre = nombre;
    }
    /*********************************************************************/
    public void hacerPedido (Plato p)
    {
        if (contadorPlatos == 1)
            this.plato1 = p;
        else
            if (contadorPlatos == 2 )
                this.plato2 = p;
            else
                this.plato3 = p;
        contadorPlatos++;
    }
    /*********************************************************************/
    public void visualizarMisPlatos()
    {
        System.out.println("Este es el pedido de : "+nombre);
        System.out.println("--------------");
        System.out.println(plato1.toString());
        System.out.println(plato2.toString());
        System.out.println(plato3.toString());
        System.out.println("\nTOTAL : "+(plato1.getPrecio()+plato2.getPrecio()+plato3.getPrecio()));
    }
}//class Cliente

