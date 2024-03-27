package Exceptions;

public class Exercise1
{
    public static void main(String[] args)
    {
        int []a = new int [5];
        
        try
        {
            for (int i = 0; i <= 5; i++)
            {
                a[i] = i;
                System.out.println(a[i]+ "  ");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Me he salido del array");
        }       
    }   
}