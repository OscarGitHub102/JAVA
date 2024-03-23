package Basics;

public class ClassMath
{
    
    public static void main(String[] args)
    {
    
        double a, b, c, d;
        int entero;
        
        a = 2.0;
        b = 3.0;
        c = 4.5;
        d = -2.5;
        
        System.out.println("El valor absoluto de d = " + Math.abs(d));
        System.out.println("El redondeo de c = " + Math.round(c));
        System.out.println("El redondeo de c = " + Math.floor(c));
        System.out.println("El redondeo de c = " + Math.ceil(c));
        
        entero = (int)c;
        
        System.out.println("La raíz cuadrada de c = " + Math.sqrt(c));
        
        entero = (int)Math.pow(2, 3);
        
        System.out.println("2 elevado a 3 es = " + entero);
        
        System.out.println("Generamos números aleatorios");
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println((int)(Math.random()*10 + 1));
        }
        
    }
    
}