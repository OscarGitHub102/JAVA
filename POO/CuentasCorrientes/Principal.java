package POO.CuentasCorrientes;

import java.util.Scanner;

public class Principal
{    
    public static void main(String[] args)
    {   
        double ingreso;
        double retiro;
        
        Cuenta c1 = new Cuenta("Pepe");
        
        Cuenta c2 = new Cuenta("Marcos", 500);
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Saldo actual de " +c1.getTitular()+ " (antes de la operación): " +c1.getSaldo());
        
        System.out.println("¿Cuánto dinero desea ingresar a " +c1.getTitular()+ "?");
        
        ingreso = entrada.nextInt();
        
        c1.ingresar(ingreso);
        
        System.out.println("Saldo actual de " +c2.getTitular()+ " (antes de la operación): " +c2.getSaldo());
        
        System.out.println("¿Cuánto dinero desea retirar a " +c2.getTitular()+ "?");
        
        retiro = entrada.nextInt();
        
        c2.retirar(retiro);
        
    }
    
}
