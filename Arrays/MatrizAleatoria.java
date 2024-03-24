package Arrays;

public class MatrizAleatoria
{
    public static void main(String[] args)
    {
        
        int [][] matriz = new int[5][4];
        
        crearMatriz(matriz);
        visualizarMatriz(matriz);
        sumatorioMatriz(matriz);
    }
    
    /**************************************************************/
    
    private static void crearMatriz (int [][] matriz)
    {
        for (int fila = 0; fila < matriz.length; fila++)
        {
            for (int columna = 0; columna < matriz[0].length; columna++)
            {
               matriz[fila][columna] = (int)(Math.random()*101); 
            }
        }
    }
    
    /**************************************************************/
    
    private static void visualizarMatriz(int [][] matriz)
    {
        System.out.println("*** MATRIZ ***");
        System.out.println("");
        
        for (int fila = 0; fila < 5; fila++)
        {       
            for (int columna = 0; columna < 4; columna++)
            {       
                System.out.print(matriz[fila][columna]+ " ");   
            }
            
            System.out.println(" ");
        }       
    }
    
    /**************************************************************/
    
    public static void sumatorioMatriz(int [][] matriz)
    {
        int suma = 0;
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                suma += matriz[i][j];
            }
        }
        
        System.out.println("");
        System.out.println("Suma total: " +suma);
    }
}