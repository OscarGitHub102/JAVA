package Arrays;

public class MediaValoresArray
{
    public static void main(String[] args)
    {
        int salario[] = new int[25];
        leerSalarios(salario);
        media(salario);
        
    }
    
    /**************************************************************/
    
    private static void leerSalarios(int salario[])
    {
        for (int i = 0; i < salario.length; i++)
        {
            salario[i] = (int)(Math.random()*2000+1000);            
        }   
        
        System.out.println("Array de salarios entre 1000 y 3000 euros generado");
    }
    
    /**************************************************************/
    
    private static void media(int salario[])
    {
        int suma = 0, media;
        
        for (int i = 0; i < salario.length; i++)
        {
            suma += salario[i];    
        }   
        
        media = (int)(suma / salario.length);
        
        System.out.println("Media de salarios = " +media);      
    }
    
}