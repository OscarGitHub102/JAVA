package POO.PC_Continentes;

public class Tienda
{
    private String nombre;
    private String encargado;
    private Ordenador[] ordenadores;
    private int numOrdenadores = 0;
    private int MAX;

/*********************************************************/

    public Tienda(String nombre, String encargado, int MAX)
    {
        this.nombre = nombre;
        this.encargado = encargado;
        this.MAX = MAX;
        ordenadores = new Ordenador[MAX];       
    }
    
/*********************************************************/
    
    public void annadir(String marca, int cantidadMemoria, String caracteristicasProcesador, String sistemaOperativo, double precio)
    {
        if( numOrdenadores >= MAX )
            System.out.println("ERROR. Número máximo de ordenadores almacenados");
        else
        {
            ordenadores[numOrdenadores] = new Ordenador(marca, cantidadMemoria, caracteristicasProcesador, sistemaOperativo, precio);
            numOrdenadores++;
            System.out.println("PC " +numOrdenadores+ " añadido correctamente");
        }        
    }
    
/*********************************************************/
    
    public void eliminar(String marcaOrdenador)
    {
        if( tiendaVacia() == false )
        {
            int pos = buscar(marcaOrdenador);
            
            if( pos >= 0 )
                
                System.out.println("");
                System.out.println("Ordenador " +(pos+1)+ " de " +ordenadores[pos].getMarca()+ " eliminado");
            {
                for (int i = pos; i < numOrdenadores - 1; i++)
                {
                    ordenadores[i] = ordenadores[i + 1];                 
                }
                
                ordenadores[numOrdenadores - 1] = null;               
                numOrdenadores--;             
            }            
        }  
    }
    
/*********************************************************/
    
    public boolean tiendaVacia()
    {
        boolean vacia = false;
        
        if( ordenadores[0] == null )
        {
            vacia = true;     
        }
        
        return vacia;     
    }
    
/*********************************************************/
    
    public int buscar(String marcaOrdenador)
    {
        int posicion = -1;
        
        for (int i = 0; i < numOrdenadores; i++)
        {
            if( ordenadores[i].getMarca().equals(marcaOrdenador) )
            {
                posicion = i;        
            }             
        }
        
        return posicion;      
    }
    
/*********************************************************/
    
    public void imprimirStock()
    {
        for (int i = 0; i < numOrdenadores; i++)
        {
            System.out.println("Ordenador " +(i+1));
            System.out.println("Marca = " +ordenadores[i].getMarca());
            System.out.println("Cantidad de memoria = " +ordenadores[i].getCantidadMemoria());
            System.out.println("Características del procesador = " +ordenadores[i].getCaracteristicasProcesador());
            System.out.println("Sistema operativo = " +ordenadores[i].getSistemaOperativo());
            System.out.println("Precio = " +ordenadores[i].getPrecio());
            System.out.println("-------------------------------");  
        }
    }
    
/*********************************************************/

    public int getNumOrdenadores() {
        return numOrdenadores;
    }
    
}