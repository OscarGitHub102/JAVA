package POO.ListaReproduccionAleatoria;

public class Lista
{
    
    private String  canciones[];
    private String  listaReproduccion[];
    private boolean seleccionada[];
    int             numCanciones;
    private int     indice = 0;
    
    /**************************************************************/
    
    public Lista(int tamanio)
    {
        
        numCanciones = tamanio;
        canciones = new String[numCanciones];
        listaReproduccion = new String[numCanciones];
        seleccionada = new boolean[numCanciones];
        iniciarCanciones();
        
    }    
    
    /**************************************************************/
    
    public void iniciarCanciones()
    {
        
        System.out.println("Lista original de canciones:");
        
        for (int i = 0; i < numCanciones; i++)
        {
        
            canciones[i] = "Canción " +Integer.toString(i);
            seleccionada[i] = false;
            System.out.println(canciones[i]);
            
        }
        
        System.out.println("");
        
    }
    
    /**************************************************************/
    
    public void crearListaDeDistribucion()
    {
        
        boolean valido = false;
        
        for (int i = 0; i < numCanciones; i++)
        {
            
            valido = false;
            
            while ( valido == false )
            {
            
                indice = (int)(Math.random()*numCanciones);
                
                if( seleccionada[indice] == false )
                {
                    
                    listaReproduccion[i] = canciones[indice];
                    seleccionada[indice] = true;
                    valido = true;
                    
                }
                
            }
               
        }
        
    }
    
    /**************************************************************/
    
    public void visualizarLista()
    {
        
        System.out.println("Lista aleatoria generada:");
        
        for (int i = 0; i < numCanciones; i++)
        {
        
            System.out.println(listaReproduccion[i]);
            
        }
        
    }
    
}