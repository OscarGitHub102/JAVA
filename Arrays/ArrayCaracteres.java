package Arrays;

import java.util.Scanner;

public class ArrayCaracteres
{
    public static void main(String[] args)
    {
        String texto;
        boolean valido = false;
        char [] caracteres = new char[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un texto (acabar con un punto): ");
        texto = sc.nextLine();
        
        int i = 0;
        
        while((i < texto.length()) && (valido == false))
        {
            if(texto.charAt(i) != '.')
            {
                i++;
            }else
            {
                valido = true;
            }
            
            if(i == texto.length())
            {
                System.out.println("Texto no válido, falta el punto");
                System.out.println("");
                System.out.print("Introduzca un texto (acabar con un punto): ");
                texto = sc.nextLine();
                i = 0;
            }
        }
        
        int j = 0;
        
        while(texto.charAt(j) != '.')
        {
            caracteres[j] = texto.charAt(j);
            System.out.print(caracteres[j]);
            j++;
        }
        System.out.println("");   
    }
    
}