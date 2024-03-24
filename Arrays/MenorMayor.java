package Arrays;

import java.util.Scanner;

public class MenorMayor
{
    public static void main(String[] args)
    {
        int [] vector = new int[5];
        System.out.println("**** VECTOR ****");
        leerDatos(vector);
        escribirDatos(vector);
        menorMayor(vector);
    }
    
    /**************************************************************/
    
    private static void leerDatos (int [] v)
    {
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < v.length; i++)
        {
            System.out.print("Introduzca el " +(i+1)+ "º valor: ");
            v[i] = entrada.nextInt();   
        }
    }
    
    /**************************************************************/
    
    private static void escribirDatos (int [] v)
    {
        System.out.println("");
        System.out.print("Vector = ");
        
        for (int i = 0; i < v.length; i++)
        {
            if(i == 0)
            {
                System.out.print("[" +v[i]+ ", ");
                
            }else if(i > 0 && i < (v.length - 1))
            {
                System.out.print(v[i]+ ", ");
            
            }else
            {
                System.out.print(v[i]+ "]");
            }
            
        }
        
        System.out.println("");
    }
    
    /**************************************************************/
    
    private static void menorMayor (int [] v)
    {
        int mayor = v[0];
        int menor = v[0];
        
        for (int i = 0; i < v.length; i++)
        {
            if (v[i] > mayor)
            {
                mayor = v[i];
            }
            
            if (v[i] < menor)
            {
                menor = v[i];
            }      
        }
        
        System.out.println("");
        System.out.println("Menor: "+menor);
        System.out.println("Mayor: " +mayor);
    }
    
}