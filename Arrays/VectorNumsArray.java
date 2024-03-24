package Arrays;

import java.util.Scanner;

public class VectorNumsArray
{
    public static void main(String[] args)
    {
        int num;
        int [][] matriz = new int[5][5];
        int [] vector = new int[25];
        
        Scanner entrada = new Scanner(System.in);
        
        generarMatriz(matriz);
        System.out.print("Introduzca el valor de comparación (se guardarán los valores menores a este): ");
        num = entrada.nextInt();
        rellenarVector(matriz, vector, num);
    }
    
    /**************************************************************/
    
    private static void generarMatriz(int [][] m)
    {
        System.out.println("*********** MATRIZ ***********");
        System.out.println("");
        
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[0].length; j++)
            {
                m[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(m[i][j]+ " ");
            }
            
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    /**************************************************************/
    
    private static void rellenarVector(int [][] m, int [] v, int num)
    {   
        int k = 0;

        System.out.print("Vector: ");
        System.out.print("[");
        
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[0].length; j++)
            {
                if( m[i][j] < num )
                {          
                    if(k == 0)
                    {
                        v[k] = m[i][j];
                        System.out.print(v[k]+ "");
                        k++;
                    }else
                    {
                        v[k] = m[i][j];
                        System.out.print(", " +v[k]);
                        k++;
                    }
                }       
            }   
        } 
        System.out.print("]");
        System.out.println("");
        System.out.println("");
    }
                
}