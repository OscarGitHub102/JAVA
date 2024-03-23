package Basics;

import java.util.Scanner;

public class Exercises
{
    public static void main(String[] args)
    {
        
        boolean disponible = true;
        
        while(disponible)
        {
        
            int op = menu();
                                    
            if(op >= 1 && op < 15)
            {
                
                switch(op)
                {

                    case 1:
                        comprobarParImpar();
                        break;

                    case 2:
                        comprobarPrimo();
                        break;
                        
                    case 3:
                        comprobarCapicua();
                        break;
                        
                    case 4:
                        calcularFactorial();
                        break;
                        
                    case 5:
                        calcularMayorMenor();
                        break;
                        
                    case 6:
                        contadorSumaParImpar();
                        break;
                        
                    case 7:
                        tablaMultiplicar();
                        break;
                        
                    case 8:
                        secuenciaDescendente();
                        break;
                        
                    case 9:
                        sumatorioCien();
                        break;
                        
                    case 10:
                        notaFinal();
                        break;
                        
                    case 11:
                        valoresFuncion();
                        break;
                        
                    case 12:
                        binario();
                        break;
                        
                    case 13:
                        ahorcado();
                        break;
                        
                    case 14:
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
        System.out.println("1. Número par/impar");
        System.out.println("2. Número primo");
        System.out.println("3. Número capicúa");
        System.out.println("4. Factorial número");
        System.out.println("5. Mayor y menor de 3 números");
        System.out.println("6. Contador y sumatorio de número pares e impares");
        System.out.println("7. Tabla de multiplicar");
        System.out.println("8. Secuencia descendente");
        System.out.println("9. Sumatorio 10 números siguientes (incluido)");
        System.out.println("10. Nota final evaluación");
        System.out.println("11. Calcular los valores de una función");
        System.out.println("12. Convertir decimal a binario");
        System.out.println("13. Ahorcado (máximo 7 fallos)");
        System.out.println("14. Salir");
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
    
    public static void comprobarParImpar()
    {
    
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Introduzca un valor: ");
        numero = sc.nextInt();
        
        if(numero % 2 ==0 )
        {
            System.out.println("El número " +numero+ " es PAR");
        
        }else
        {
            System.out.println("El número " +numero+ " es IMPAR");
        }
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void comprobarPrimo()
    {
        
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0;
        
        System.out.print("Introduzca un valor: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++)
        {
            if ( numero % i == 0 )
            {
                contador += 1;
            }   
        }
        
        if (contador > 2)
        {
            System.out.println("El número " +numero+ " NO es primo");
        
        }else
        {
            System.out.println("El número " +numero+ " SÍ es primo");
        }
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void comprobarCapicua()
    {
    
        int original, invertido = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un valor: ");
        int num = sc.nextInt();
        
        original = num;
        
        while(num > 0)
        {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }
        
        if(original == invertido)
        {
            System.out.println("El número " +original+ " SÍ es capicúa");
        }else
        {
            System.out.println("El número " +original+ " NO es capicúa");
        }
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void calcularFactorial()
    {
        
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un valor positivo: ");
        int num = sc.nextInt();
        
        while(num < 0)
        {
            System.out.println("Valor negativo");
            System.out.print("Introduzca un valor positivo: ");
            num = sc.nextInt();
        }
        
        if(num == 0)
        {
            System.out.println("El factorial de " +num+ " es 1");
        }else
        {
            for(int i = 1; i <= num; i++)
            {
                factorial *= i;
            }
            
            System.out.println("El factorial de " +num+ " es " +factorial);
        }
    
        espacios();
    }
    
    /**************************************************************/
    
    public static void calcularMayorMenor()
    {
    
        Scanner sc = new Scanner(System.in);
    
        int mayor;
        int menor;
        
        System.out.print("Introduzca el primer valor: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduzca el segundo valor: ");
        int num2 = sc.nextInt();
        
        System.out.print("Introduzca el tercer valor: ");
        int num3 = sc.nextInt();
        
        if(num1 > num2)
        {
            if(num1 > num3)
            {
                mayor = num1;
                
                if(num2 > num3)
                {
                    menor = num3;
                }else
                {
                    menor = num2;
                }
            }else
            {
                mayor = num3;
                menor = num2;
            }
            
        }else
        {
            if(num2 > num3)
            {
                mayor = num2;
                
                if(num1 > num3)
                {
                    menor = num3;
                }else
                {
                    menor = num1;
                }
            }else
            {
                mayor = num3;
                menor = num1;
            }
        }
        
        System.out.println("");
        System.out.println("El número menor es: " +menor);
        System.out.println("El número mayor es: " +mayor);
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void contadorSumaParImpar()
    {
    
        boolean valido = true;
        int pares = 0, impares = 0, totales = 0, sumPares = 0, sumImpares = 0, sumTotal = 0;
        Scanner sc = new Scanner(System.in);
        
        while(valido)
        {
            System.out.print("Introduzca un valor (con 0 finaliza) : ");
            int num = sc.nextInt();
            
            if(num == 0)
            {
                valido = false;
            }else
            {
                if(num % 2 ==0 )
                {
                    pares++;
                    sumPares = sumPares + num;
                    totales++;
                    sumTotal = sumTotal + num;

                }else
                {
                    impares++;
                    sumImpares = sumImpares + num;
                    totales++;
                    sumTotal = sumTotal + num;
                }
            }
        }
        
        System.out.println("Cantidad de pares: " +pares);
        System.out.println("Sumatorio de pares: " +sumPares);
        System.out.println("Cantidad de impares: " +impares);
        System.out.println("Sumatorio de impares: " +sumImpares);
        System.out.println("Cantidad total de números: " + totales);
        System.out.println("Sumatorio total de números: " +sumTotal);
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void tablaMultiplicar()
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un valor: ");
        int num = sc.nextInt();
        
        System.out.println("");
        
        for (int i = 1; i <= 9; i++)
        {
            System.out.println("" +num+ " x " +i+ " = " +(num*i));
        }
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void secuenciaDescendente()
    {

        int num, anterior = Integer.MAX_VALUE, contador = 0;
        boolean seguir = true, encontrado = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca la cantidad de números que desea que tenga la secuencia: ");
        int numSec = sc.nextInt();
        
        while(seguir && encontrado == false)
        {
            System.out.print("Introduzca un valor (con 0 finaliza): ");
            num = sc.nextInt();
            
            if(num != 0)
            {
                if(anterior > num)
                {
                    contador++;
                    anterior = num;
                    
                }else
                {
                    anterior = num;
                    contador = 1;
                }
            
            }else
            {
                seguir = false;
            }
            
            if(contador == numSec)
            {
                encontrado = true;
            }
            
        }

        System.out.println("");
        
        if(seguir == false)
        {
            System.out.println("Saliendo ...");
        }
        
        if(encontrado)
        {
            System.out.println("Secuencia de " +numSec+ " números descendientes encontrada");
        }
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void sumatorioCien()
    {
        
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un valor positivo: ");
        int num = sc.nextInt();
        
        while(num < 0)
        {
            System.out.println("Valor negativo");
            System.out.print("Introduzca un valor positivo: ");
            num = sc.nextInt();
        }
        
        for(int i = num; i < num + 10 ; i++)
        {
            suma += i;
        }
        
        System.out.println("La suma de los 10 números siguientes (incluido) es: " +suma);
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void notaFinal()
    {
    
        int notaFinal;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca la nota de la 1ª Evaluación: ");
        int nota1 = sc.nextInt();
        
        System.out.print("Introduzca la nota de la 2ª Evaluación: ");
        int nota2 = sc.nextInt();
        
        System.out.print("Introduzca la nota de la 3ª Evaluación: ");
        int nota3 = sc.nextInt();
        
        if(nota3 >= 5)
        {
            notaFinal = Math.round((nota1 + nota2 + nota3)/3);
            
            if(notaFinal < 5)
            {
                notaFinal = 5;
            }
            
            System.out.println("");
            System.out.println("El alumn@ ha aprobado con una nota de " +notaFinal);
            
        }else
        {
            notaFinal = Math.round((nota1 + nota2 + nota3)/3);
            
            if(notaFinal >= 5)
            {
                notaFinal = 4;
            }
            
            System.out.println("");
            System.out.println("El alumn@ ha suspendido con una nota de " +notaFinal);
        }
        
        espacios();
    }

    /**************************************************************/
    
    public static void valoresFuncion()
    {
        
        double resultado;
        
        for(int x = -3; x <= 3; x = x + 2)
        {
            for(int y = -1; y <= 1; y++)
            {
                resultado = (Math.sqrt(x)/((Math.pow(y,2)) - 1));
                System.out.println("Cuando x = " +x+ " y la y = " +y+ " el resultado es: " +resultado);
            }
        }
        
        espacios();
    }
    
    /**************************************************************/
    
    public static void binario()
    {
        
        int num, num1, resto, i = 7, posicion = 0, j = 0;
        boolean salir = false, encontrado = false;
        int [] restos = new int[8];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un valor entre 1 y 255 (con 0 o negativo finaliza): ");
        num = sc.nextInt();
        
        while(num <= 0)
        {
            System.out.println("ERROR. Número no válido");
            System.out.print("Introduzca un valor entre 1 y 255 (con 0 o negativo finaliza): ");
            num = sc.nextInt();
        }
        
        num1 = num;
        
        while(i >= 0 && salir == false)
        {
            resto = num % 2;
            restos[i] = resto;
            i--;
            
            num = num / 2;
            
            if(num == 0 || num == 1)
            {
                restos[i] = num;
                i--;
                salir = true;
            }
            
        }
        
        while((j < restos.length) && encontrado == false)
        {
            if(restos[j] == 1)
            {
                posicion = j;
                encontrado = true;
            }
            
            j++;
        }
        
        System.out.println("");
        System.out.print("El número decimal " +num1+ ", en binario es: ");
        
        for(int k = posicion; k < restos.length ; k++)
        {
            System.out.print(restos[k]);
        }
            
        System.out.println("");
        espacios();
    }
    
    /**************************************************************/
    
    public static void ahorcado()
    {
        
        int contador = 1;
        boolean acierto = false;
        int aleatorio = (int)(Math.random()*120+1);
        
        System.out.println("Número aleatorio generado");
        System.out.println(aleatorio);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un valor entre 1 y 120: ");
        int num = sc.nextInt();
        
        num = pedirNumero(num);
        
        if(num == aleatorio)
        {
            acierto = true;
        }
        
        while(contador <= 7 && acierto == false)
        {
            System.out.println("");
            System.out.println("Fallo");
            System.out.println("Nº fallos: " +contador);
            mayorMenor(aleatorio, num);
          
            System.out.print("Introduzca un valor entre 1 y 120: ");
            num = sc.nextInt();
            
            num = pedirNumero(num);
            
            if(num == aleatorio)
            {
                acierto = true;
            }else
            {
                contador++;
            }
        }
        
        if(acierto)
        {
            System.out.println("¡Número acertado!");
        }
        
        if(contador == 8)
        {
            System.out.println("Perdiste. El número era el: " +aleatorio);
        }
        
        espacios();
    }
    
    /**************************************************************/
    
    public static int pedirNumero(int numero)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        while(numero < 1 || numero > 120)
        {
            System.out.println("");
            System.out.println("ERROR. Número no válido");
            System.out.print("Introduzca un valor entre 1 y 120: ");
            numero = scanner.nextInt();
        }
        
        return numero;
    }
    
    /**************************************************************/
    
    public static void mayorMenor(int numero, int num)
    {
        if(numero > num)
        {
            System.out.println("El número generado es MAYOR que " +num);
        }else
        {
            System.out.println("El número generado es MENOR que " +num);
        }
        
        System.out.println("");
    }
    
}