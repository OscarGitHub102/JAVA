package POO.CuadranteMatriz;

public class Matriz
{
 
    private int [][] matriz;
    private Cuadrante [] cuadrantes;
    private int cuadro [][];
   
    /********************************************************************
    *********************************************************************/
    
    public Matriz (int [][] m)
    { 
        matriz = m;
        cuadrantes = new Cuadrante[4];
        cuadro = new int[2][2];
        partirCuadrantes();
   }
    
    //********************************************************************
    
    public void partirCuadrantes()
    {
        int contador = 0;
        
        //primer cuadrante
        
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j <= 1; j++)
            {
                cuadro[i][j] = matriz[i][j];
             }
        }
        
        cuadrantes[contador] = new Cuadrante(cuadro);
        
        contador += 1;
        
        //segundo cuadrante
        
        for (int i = 0; i <=1 ; i++)
        {
            for (int j = 0; j <= 1; j++)
            {
                cuadro[i][j] = matriz[i][j + 2];
            }
        }
        
        cuadrantes[contador] = new Cuadrante(cuadro); 
        contador += 1;
        
        //tercer cuadrante
        
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j <= 1; j++)
            {
                cuadro[i][j] = matriz[i + 2][j];
            }
        }
        
        cuadrantes[contador] = new Cuadrante(cuadro);
        contador += 1;
        
        //cuarto cuadrante
        
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j <= 1; j++)
            {
                cuadro[i][j] = matriz[i + 2][j + 2];
            }
        }
        
        cuadrantes[contador] = new Cuadrante(cuadro);
       
    }
    
    public static void generarAleatoria(int [][] m)
    {
        System.out.println("");
        
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[0].length; j++)
            {
                m[i][j] = (int)(Math.random()*9+1);
            }
        }
    }
}