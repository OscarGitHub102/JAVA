package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise2
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("C:/pruebas/ejemplo.txt");
            FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error. Fichero no encontrado");
        }
    }
}