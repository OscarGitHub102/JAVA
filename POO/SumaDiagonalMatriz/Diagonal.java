package POO.SumaDiagonalMatriz;

public class Diagonal
{
    private int matriz [][];
    private int vector[];
    private int suma;
    private int num;
    
    /**************************************************************/
    /**************************************************************/
    
    public Diagonal(int matriz[][], int num)
    { 
        matriz = new int [num][num];
        vector = new int [num];
        this.matriz = matriz;
        this.num = num;
   }
    
    /**************************************************************/
    
    public void vector(int matriz[][])
    {
        for (int i = 0; i < num; i++)
        {   
            for (int j = 0; j < num; j++)
            { 
                if ( i == j )
                {
                    vector[i] = matriz[i][j];
                }
            }            
        }
    }
    
    /**************************************************************/
    
    public void suma()
    {
        int suma = 0;
        
        for (int i = 0; i < num; i++)
        { 
            suma = suma + vector[i];
        }
        
        this.suma = suma;
    }
    
    /**************************************************************/
    
    public void visualizar()
    {          
        System.out.print("Diagonal: ");
        
        for (int i = 0; i < num; i++)
        {
            System.out.print(vector[i]+ " ");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("La suma de la diagonal es: " +suma);
    }
}
