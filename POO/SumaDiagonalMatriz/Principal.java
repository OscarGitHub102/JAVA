package POO.SumaDiagonalMatriz;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        int orden;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el número de filas/columnas: ");
        
        orden = entrada.nextInt();
        
        int matriz[][] = new int [orden][orden];
        
        inicializarMatriz(matriz, orden);
        
        Diagonal diagonal = new Diagonal(matriz, orden);
        
        System.out.println("");
        
        diagonal.vector(matriz);
        
        diagonal.suma();
        
        diagonal.visualizar();
   }
    
    /**************************************************************/
    
    public static void inicializarMatriz(int matriz[][], int orden)
    {
        for (int i = 0; i < orden; i++)
        {
            for (int j = 0; j < orden; j++)
            {
                matriz[i][j] = (int)(Math.random()*9 + 1);
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
       }
    }
}