package Basics;

import java.util.Scanner;

public class Bucles
{
    
    public static void main(String[] args)
    {
        
        int numero, contador = 0;
        boolean seguir = true;

        //1. Bucle while con lectura adelantada

        System.out.println("1. Bucle while con lectura adelantada");

        Scanner entrada = new Scanner(System.in); 
        System.out.print("Introduce un número: ");

        numero = entrada.nextInt();

        while ( numero != 0 )
        {

            System.out.println("El número introducido es: " + numero);
            contador ++;

        }                        

        System.out.println("Números introducidos" + contador);

        //2. Bucle while con "flag" booleano

        System.out.println("2. Bucle while con \"flag\" booleano");

        contador = 0;

        while ( seguir )
        {
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();

            if ( numero != 0 )
            {
                System.out.println("El número introducido es: " + numero);
                contador ++;
            }
            else

                seguir = false;
        }

        System.out.println("Números introducidos" + contador);

        //3. Bucle for

        //for(;;) --> Bucle for infinito hasat que se introduzca un 0

        System.out.println("3. Bucle for");

        contador = 0;

        for (;;)
        {
            System.out.print("Introduce un número: ");      
            numero = entrada.nextInt();

            if ( numero != 0 )

                break;

            else

                System.out.println("El número introducido es: " + numero);
                contador ++;
        }

        System.out.println("Números introducidos" + contador);

        //4. Bucle do-while

        System.out.println("4. Bucle do-while");

        contador = 0;

        do
        {

            System.out.print("Introduce un número: ");  
            numero = entrada.nextInt();

            if( numero != 0)
            {
                contador ++;
                System.out.println("El número introducido es: " + numero);

            }

        } while ( numero != 0 );

        System.out.println("Números introducidos" + contador);
        
    }
    
}