package Arrays;

import java.util.Scanner;

public class Temperatura_Ciudad_Mes
{
    public static void main(String[] args)
    {
        
        String [] provincias = {"Madrid", "Alicante", "Toledo", "Segovia"};
        
        String [] meses = {"Enero", "Febrero", "Marzo",};
        
        double [][] temperaturas = { {10.5, 13.8, 17.2}, {16.7, 19.0, 23.1}, {8.8, 9.7, 14.5}, {5.9, 9.3, 13.6}};
        
        int opcion;
        
        boolean valido = true;
        
        Scanner sc = new Scanner(System.in);
        
        menu();
        
        while(valido)
        {
            System.out.print("Introduzca una opción: ");
            opcion = sc.nextInt();
            
            if(opcion >= 1 && opcion <= 4)
            {
                switch (opcion)
                {
                    case 1:
                        temperaturas(provincias, meses, temperaturas);
                        menu();
                        break;

                    case 2:
                        mediaProvincia(provincias, temperaturas);
                        menu();
                        break;

                    case 3:
                        mediaMes(meses, temperaturas);
                        menu();
                        break;

                    case 4:
                        System.out.println("Saliendo ...");
                        valido = false;
                        break;
                }
            
            }else
            {
                System.out.println("Opción incorrecta");
                espacios();
                menu();
            }
        }
    }
    
    /**************************************************************/
    
    public static void menu()
    {
        System.out.println("******* MENÚ *******");
        System.out.println("1. Consultar las temperaturas de una provincia en un mes");
        System.out.println("2. Calcular la media de temperatura en una provincia");
        System.out.println("3. Calcular la media de temperatura en un mes");
        System.out.println("4. Salir");
        System.out.println("");
    }
    
    /**************************************************************/
    
    public static void temperaturas(String [] provincias, String [] meses, double [][] temperaturas)
    {
        System.out.println("");
        int i = 0, j = 0;
        boolean encontrado = false, encontrado2 = false;
        String mes = pedirMes();
        String provincia = pedirProvincia();
        
        while((encontrado == false) && (i < provincias.length))
        {
            if(provincias[i].equalsIgnoreCase(provincia))
            {
                while((encontrado2 == false) && (j < meses.length))
                {
                    if(meses[j].equalsIgnoreCase(mes))
                    {
                        System.out.println("Temperatura: " +temperaturas[i][j]+ "º");
                        encontrado = true;
                        encontrado2 = true;
                    }else
                    {
                        j++;
                    }
                }
            }else
            {
                i++;
            }
        }
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void mediaProvincia(String [] provincias, double [][] temperaturas)
    {
        System.out.println("");
        String provincia = pedirProvincia();
        double suma = 0, media = 0;
        
        for(int i = 0; i < provincias.length ;i++)
        {
            if(provincias[i].equalsIgnoreCase(provincia))
            {
                for (int j = 0; j < temperaturas[i].length; j++)
                {
                    suma += temperaturas[i][j];
                }
            }
        }
        
        media = suma / temperaturas.length - 1;
        System.out.println("Media de temperaturas en " +provincia+ " : " +media);
        espacios();
    }
    
    /**************************************************************/

    public static void mediaMes(String [] meses, double [][] temperaturas)
    {
        System.out.println("");
        String mes = pedirMes();
        double suma = 0, media = 0;
        
        for(int i = 0; i < meses.length ;i++)
        {
            if(meses[i].equalsIgnoreCase(mes))
            {
                for (int j = 0; j < temperaturas[i].length; j++)
                {
                    suma += temperaturas[i][j];
                }
            }
        }
        
        media = suma / temperaturas.length;
        System.out.println("Media de temperaturas en " +mes+ " : " +media);
        espacios();
    }
    
    /**************************************************************/
    
    public static String pedirMes()
    {
        String mes;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Introduzca el mes (Enero, Febrero, Marzo): ");
        mes = sc.nextLine();
        
        return mes;
    }
    
    /**************************************************************/
    
    public static String pedirProvincia()
    {
        String provincia;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Introduzca la ciudad (Madrid, Alicante, Toledo, Segovia): ");
        provincia = sc.nextLine();

        return provincia;
    }
    
    /**************************************************************/
    
    public static void espacios()
    {
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");
    }
    
}