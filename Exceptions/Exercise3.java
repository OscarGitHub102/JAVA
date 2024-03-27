package Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce números (0 para salir):");			

        int numero = -1;
        
        while (numero != 0)
        {
            try 
            {
                numero = entrada.nextInt();
            
                if (numero != 0)
                    lista.add(numero);
            }   
            catch (InputMismatchException ime)
            {
                System.out.println("¡Cuidado! Solo puedes insertar números. ");
                System.out.println("");
                System.out.println("Introduce números (0 para salir):");
                entrada.next();
            }			
        }
        
        System.out.println("Has introducido: ");
        for (int i:lista)
            System.out.print(i+"  ");
        
        System.out.println("");
    }
}