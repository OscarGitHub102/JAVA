package POO.Oca;

import java.util.Scanner;

public class Tablero
{
    private Casilla tablero[];
    private int numCasillas = 42;
    
    Scanner entrada = new Scanner(System.in);
    
    /**************************************************************/
    
    public Tablero()
    {
        tablero = new Casilla[numCasillas];        
    }
    
    /**************************************************************/
    
    public void crearLaberinto()
    {
        for (int i = 0; i < numCasillas; i++)
        {   
            tablero[i] = new Casilla(i, "normal", i);           
        }        
    }
    
    /**************************************************************/
    
    public void elegirOca()
    {
        int oca, k = 0;
        
        System.out.println("********* OCAS *********");
        System.out.println("");
        
        while ( k < 4 )
        {
            System.out.print("Introduce una casilla para la " +(k+1)+ "ª oca: ");
            oca = entrada.nextInt();

            tablero[oca].setTipo("oca");
            k++;             
        }
        
        System.out.println("");        
    }
    
    /**************************************************************/
    
    public void elegirMuerte()
    {
        int muerte, k = 0;
        
        System.out.println("********* MUERTES *********");
        System.out.println("");
        
        while ( k < 5 )
        {
            System.out.print("Introduce una casilla para la " +(k+1)+ "ª muerte: ");
            muerte = entrada.nextInt();

            tablero[muerte].setTipo("muerte");
            k++;             
        }
        
        System.out.println("");
    }
    
    /**************************************************************/
    
    public void simularJuego()
    {
        int pos = 0, dado;
        boolean dentro = true;
        
        System.out.println("********* INICIO DEL JUEGO *********");
        System.out.println("");
        System.out.println("Se sale de la casilla 0");
        System.out.println("");
        
        while ( pos < numCasillas - 1 )
        {
            dado = (int)(Math.random()*6+1);
            
            dentro = comprobarLimite(pos, dado);
            
            if ( dentro == true )
            {
                pos = pos + dado;

                System.out.print("Tirada de dado = " +dado+ ", Casilla actual = " +pos);

                pos = comprobarOca(pos);
                pos = comprobarMuerte(pos);

                System.out.println("");
                
                if ( pos == numCasillas - 1 )
                {
                    System.out.println("");
                    System.out.println("¡¡ENHORABUENA, HAS GANADO!!");
                }                
            }else
            {
                System.out.println("Tirada de dado = " +dado+ ", Casilla actual = " +pos);                
            }
        }        
    }
    
    /**************************************************************/
    
    public int comprobarOca(int posicion)
    {
        int pos2;
        boolean encontrado = false;

        pos2 = posicion;

        if ( tablero[posicion].getTipo().equals("oca") )
        {
            posicion++;

            while( posicion < numCasillas && encontrado == false )
            {
                if ( tablero[posicion].getTipo().equals("oca") )
                {
                   System.out.print(", Oca. Casilla actual: " +posicion);
                   encontrado = true;
                }else
                {
                   posicion++;
                   
                   if( posicion == numCasillas )
                   {
                        posicion = pos2;                       
                   }
                }
            }
        }

        return posicion;
    }
   
    /**************************************************************/
   
    public int comprobarMuerte(int posicion)
    {
        if ( tablero[posicion].getTipo().equals("muerte") )
        {
            posicion = 0;
            
            System.out.print(", Muerte. Casilla actual: " +posicion);
        }
        
        return posicion;
    }
    
    /**************************************************************/
    
    public boolean comprobarLimite(int posicion, int dado)
    {
        boolean dentro = true;
        
        posicion = posicion + dado;
        
        if ( posicion >= numCasillas )
        {
            dentro = false;            
        }
        
        return dentro;        
    }    
}