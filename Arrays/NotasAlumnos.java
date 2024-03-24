package Arrays;

import java.util.Scanner;

public class NotasAlumnos
{
    public static void main(String[] args)
    {
        
        String nombre;
        int eleccion;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        
        String nombres [] = {"Pepe", "Ana", "Luis", "Eva", "Felipe"};
        int notas [][] = {{3, 6, 9}, {1, 5, 5}, {8, 3, 8}, {5, 4, 6}, {5, 6, 9}};
        
        while(salir == false)
        {
            
            System.out.println("***** MENÚ *****");
            System.out.println("1. Buscar alumno");
            System.out.println("2. Salir");
            System.out.println("");
            System.out.print("Introduzca una opción: ");
            int opcion = sc.nextInt();
            
            switch (opcion)
            {
                case 1:
                    nombre = solicitarNombre(nombres);
                    eleccion = menu();
                    buscarNota(nombres, notas, nombre, eleccion);
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Saliendo ...");
                    salir = true;
            }   
        }
                
    }
    
    /**************************************************************/
    
    public static String solicitarNombre(String [] nombres)
    {
        
        String nom;
        boolean encontrado = false;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        System.out.print("Introduzca el nombre del alumn@: ");
        nom = sc.nextLine();
        
        while((i < nombres.length) && (encontrado == false))
        {
            if(nombres[i].equalsIgnoreCase(nom))
            {
                encontrado = true;
            }else
            {
                i++;
            }
        }
        
        if(encontrado == false)
        {
            System.out.println("Nombre incorrecto");
            solicitarNombre(nombres);
        }
        
        return nom;
        
    }
    
    /**************************************************************/
    
    public static int menu()
    {        
        int opcion;
        Scanner sc = new Scanner(System.in);
        boolean valido = true;
        
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("¿Qué desea visualizar?");
        System.out.println("1. Nota de la 1ª Evaluación");
        System.out.println("2. Nota de la 2ª Evaluación");
        System.out.println("3. Nota de la 3ª Evaluación");
        System.out.println("4. Aprobado / Suspenso");
        System.out.println("5. Salir");   
        System.out.println("");
        System.out.print("Introduzca una opción: ");
        opcion = sc.nextInt();
        
        while(valido)
        {            
            if(opcion < 1 || opcion > 5)
            {
                System.out.println("Opción no válida");
                System.out.println("");
                System.out.print("Introduzca una opción: ");
                opcion = sc.nextInt();
            }else
            {
                valido = false;
            }
        }
        
        return opcion;
    }
    
    /**************************************************************/
    
    public static void buscarNota(String [] nombres, int [][] notas, String nombre, int opcion)
    {
        int i = 0;
        boolean salir = false;
        
        while((salir == false) && (i < nombres.length))
        {
        
            if(opcion >= 1 && opcion <= 3)
            {
                if(nombres[i].equalsIgnoreCase(nombre))
                {
                    System.out.println("Nota de " +nombre+ " en la " +opcion+ "ª Evaluación: " +notas[i][opcion- 1]);
                    System.out.println("");
                    salir = true;
                }else
                {
                    i++;
                }
            }else if(opcion == 4)
            {
                if(nombres[i].equalsIgnoreCase(nombre))
                {
                    int suma = 0, media = 0;
                    
                    for (int j = 0; j < 3; j++)
                    {
                        suma += notas[i][j];   
                    }
                    
                    media = suma / 3;
                    System.out.println("La nota media de " +nombre+ " es: " +media);
                    
                    if(media >= 5)
                    {
                        System.out.println("APROBAD@");
                    }else
                    {
                        System.out.println("SUSPENS@");
                    }
                    
                    System.out.println("");
                    salir = true;
                    
                }else
                {
                    i++;
                }
                
            }else
            {
                salir = true;
                System.out.println("Saliendo ...");
                System.out.println("");
            }
            
            
            
        }
    }
    
}