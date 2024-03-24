package Arrays;

public class Barquitos
{
    public static void main(String[] args)
    {
    
        String [][] mapa = new String [10][10];
        
        int filaMax = 10, columnaMax = 10, posicionMax = 2;
        
        int fila, columna, posicion;
        
        generarMapa(mapa);
        
        fila  = generarValor(filaMax);
        
        columna = generarValor(columnaMax);
        
        posicion = generarValor(posicionMax);
        
        System.out.println("Coordenadas: (" +(columna+1)+ "," +(fila+1)+ ")");
        
        if(posicion == 0)
        {
            System.out.println("Posición: Horizontal");
        }else
        {
            System.out.println("Posición: Vertical");
        }
        
        System.out.println("");
                
        generarBarco(mapa, fila, columna, posicion);
        
        verMapa(mapa, fila, columna, posicion);
        
    }
    
    /**************************************************************/
    
    private static int generarValor( int max )
    {
        
        int valor;
        
        valor = (int)(Math.random()*max);
        
        while ( valor > 6 )
        {
         
            valor = (int)(Math.random()*max);
            
        }
        
        return valor;
        
    }
    
    /**************************************************************/
    
    private static void generarMapa(String [][] mapa)
    {
                
        for (int i = 0; i < mapa.length; i++)
        {
         
            for (int j = 0; j < mapa[0].length; j++)
            {
            
                mapa[i][j] = ".";

            }
                    
        }
        
    }
    
/**************************************************************/
    
  private static void generarBarco(String [][] mapa, int fila, int columna, int posicion)
    {
        
        if ( posicion == 0 )
        {
            
            for (int i = fila; i < fila + 1; i++)
            {
            
                for (int j = columna; j < columna + 4; j++)
                {
                
                    mapa [i][j] = "X";
                    
                }
                
            }
            
        }
            
        if( posicion == 1)
        {
            for (int i = fila; i < fila + 4; i++)
            {
                
                for (int j = columna; j < columna + 1; j++)
                {
                    
                   mapa[i][j] = "X";
                    
                }
                
            }
            
        }
        
    }
  
      /**************************************************************/
    
    private static void verMapa(String [][] mapa, int fila, int columna, int posicion)
    {
                
        for (int i = 0; i < mapa.length; i++)
        {
         
            for (int j = 0; j < mapa[0].length; j++)
            {
            
                System.out.print(mapa[i][j]);

            }
            
            System.out.println(" ");
        
        }
        
    }

}//fin class