package Basics;

import java.util.Scanner;

public class Variables
{

    public static void main(String[] args)
    {
        
        String name;
        int age;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        name = entrada.nextLine();
        
        System.out.print("Introduce tu edad: ");
        age = entrada.nextInt();
        
        System.out.println("Tu nombre es " + name +" y tu edad es " + age);
        
        System.out.println("****************************");
        
        String nombre =  "OSCAR";
        int edad = 25;
        float saldo = 1000F;
        
        System.out.println("\"Nombre\" : " +nombre);
        System.out.println("\"Edad\" : " +edad+ " años");
        System.out.println("\"Saldo\" : " +saldo+ " euros");
        
    }
    
}