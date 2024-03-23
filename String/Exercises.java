package String;

import java.util.Scanner;

public class Exercises
{
    public static void main(String[] args)
    {
        
        boolean disponible = true;
        
        while(disponible)
        {
        
            int op = menu();
                                    
            if(op >= 1 && op < 6) // cambiar el 15
            {
                
                switch(op)
                {
                    
                    case 1:
                        alReves();
                        break;
                    
                    case 2:
                        patron();
                        break;
                        
                    case 3:
                        contarValores();
                        break;
                        
                    case 4:
                        comprobarCorreo();
                        break;
                        
                    case 5:
                        disponible = false;
                        break;
                }
                             
            }else
            {
                System.out.println("Opción incorrecta");
                espacios();
            }
        }
    }
    
    /**************************************************************/
    
    public static int menu()
    {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("************ MENÚ ************");
        System.out.println("");
        System.out.println("1. Escribir un texto al revés");
        System.out.println("2. Escribir un texto a partir del primer patrón encontrado (letra / cadena)");
        System.out.println("3. Contar valores de un texto");
        System.out.println("4. Comprobar correo");
        System.out.println("5. Salir");
        System.out.println("");
        
        System.out.print("Introduzca una opción: ");
        opcion = sc.nextInt();
        
        espacios();
        
        return opcion;
    }
    
    /**************************************************************/
    
    public static void espacios()
    {
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");
    }
    
    /**************************************************************/
    
    public static void contarValores()
    {
        
        boolean volver = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un texto: ");
        String text = sc.nextLine();
        System.out.println("");
        
        while(volver == false)
        {
            
            System.out.println("1. Vocales");
            System.out.println("2. Consonantes");
            System.out.println("3. Comas");
            System.out.println("4. Puntos");
            System.out.println("5. Espacios");
            System.out.println("6. Volver al menú");
            System.out.println("");
            System.out.print("¿Qué desea contar?: ");
            int opcion = sc.nextInt();
        
            if(opcion >= 1 && opcion <= 6)
            {
                
                switch (opcion)
                {
                    case 1:
                        vocales(text);
                        break;

                    case 2:
                        consonantes(text);
                        break;

                    case 3:
                        comas(text);
                        break;

                    case 4:
                        puntos(text);
                        break;

                    case 5:
                        vacio(text);
                        break;

                    case 6:
                        volver = true;
                        System.out.println("Volviendo al menú ...");
                        break;

                }
                
            }else
            {
                System.out.println("Opción incorrecta");
                espacios();
            }
        }
        
        System.out.println(""); 
    }
    
    /**************************************************************/
    
    public static void vocales(String texto)
    {
        
        int contador = 0;
        
        for(int i = 0; i < texto.length(); i++)
        {
            
            char caracter = texto.charAt(i);
        
            if( caracter == 'A' || caracter == 'a' ||
                caracter == 'E' || caracter == 'e' ||
                caracter == 'I' || caracter == 'i' ||
                caracter == 'O' || caracter == 'o' ||
                caracter == 'U' || caracter == 'u')
            {
                contador++;
            }
            
        }
        
        System.out.println("Hay " +contador+ " vocal/es");
        System.out.println("");
    }
    
    /**************************************************************/
    
    public static void consonantes(String texto)
    {
        
        int contador = 0;
        
        for(int i = 0; i < texto.length(); i++)
        {
            
            char caracter = texto.charAt(i);
        
            if( caracter != 'A' && caracter != 'a' &&
                caracter != 'E' && caracter != 'e' &&
                caracter != 'I' && caracter != 'i' &&
                caracter != 'O' && caracter != 'o' &&
                caracter != 'U' && caracter != 'u' &&
                caracter != ',' && caracter != '.' &&
                caracter != ' ')
            {
                contador++;
            }
            
        }
        
        System.out.println("Hay " +contador+ " consonante/s");
        System.out.println("");
    }
    
    /**************************************************************/
    
    public static void comas(String texto)
    {
        
        int contador = 0;
        
        for(int i = 0; i < texto.length(); i++)
        {
            
            char caracter = texto.charAt(i);
        
            if(caracter == ',')
            {
                contador++;
            }
            
        }
        
        System.out.println("Hay " +contador+ " coma/s"); 
        System.out.println("");
    }
    
    /**************************************************************/
    
    public static void puntos(String texto)
    {
        
        int contador = 0;
        
        for(int i = 0; i < texto.length(); i++)
        {
            
            char caracter = texto.charAt(i);
        
            if(caracter == '.')
            {
                contador++;
            }
            
        }
        
        System.out.println("Hay " +contador+ " punto/s"); 
        System.out.println("");
    }
    
    /**************************************************************/
    
    public static void vacio(String texto)
    {
        
        int contador = 0;
        
        for(int i = 0; i < texto.length(); i++)
        {
            
            char caracter = texto.charAt(i);
        
            if(caracter == ' ')
            {
                contador++;
            }
            
        }
        
        System.out.println("Hay " +contador+ " espacio/s"); 
        System.out.println("");
    }
    
    /**************************************************************/
    
    public static void alReves()
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un texto: ");
        String text = sc.nextLine();
        
        System.out.println("");
        
        for(int i = text.length()-1; i >= 0 ; i--)
        {
            System.out.print(text.charAt(i));
        }
        
        espacios();
       
    }
    
    /**************************************************************/
    
    public static void patron()
    {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un texto: ");
        String text = sc.nextLine();
        
        System.out.println("");
        
        System.out.print("Introduzca la subcadena (si se deja vacío, imprime todo el texto): ");
        String subcadena = sc.nextLine();
        
        System.out.println("");
        
        for(int i = text.indexOf(subcadena); i < text.length() ;i++)
        {
            System.out.print(text.charAt(i));
        }
        
        espacios();
    }

    /**************************************************************/
    
    public static void comprobarCorreo()
    {
        
        int posicion;
        String correo, dominio, usuario;
        correo = pedirCorreo();

        posicion = correo.indexOf('@');
        usuario = correo.substring(0, posicion);
        dominio = correo.substring(posicion + 1);

        System.out.println("Usuario: " +usuario);
        System.out.println("Dominio: " +dominio);
        System.out.println("");
        
    }
    
    /**************************************************************/
    
    public static String pedirCorreo()
    {
        
        boolean valido = false, arroba = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un correo: ");
        String c = sc.nextLine();
            
        arroba = arroba(c);
        
        while(valido == false)
        {
            
            if(arroba)
            {
                valido = true;
                System.out.println("Correo válido");
                System.out.println("");
            
            }else
            {
            
                System.out.println("");
                System.out.println("Correo inválido, falta el @");
                System.out.println("");
                System.out.println("Introduzca un correo: ");
                c = sc.nextLine();
                
                arroba = arroba(c);
                
            }
        }
        
        return c; 
    }
    
    /**************************************************************/
    
    public static boolean arroba(String correo)
    {
        
        int i = 0;
        
        boolean arroba = false;
        
        while((i < correo.length()) && arroba == false)
        {
            if(correo.charAt(i) == '@')
            {
                arroba = true;
            }
            
            i++;
        }
        
        return arroba;
    
    }
    
    /**************************************************************/
    
    
    
}