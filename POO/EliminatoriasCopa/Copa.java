package POO.EliminatoriasCopa;

public class Copa
{
    
    private String equipos[] = {"Estudiantes", "Real Madrid", "Barcelona", "Baskonia", "Lenovo Tenerife", "Joventut", "Gran Canaria", "Unicaja"};
    private boolean booleanos[];
    
    private String cuartos[];
    private String semis[];
    private String Final[];
    
    private static int equiposCuartos = 8;
    private static int equiposSemis = 4;
    private static int equiposFinal = 2;
    
    /**************************************************************/
    
    public Copa()
    {
        booleanos = new boolean [equiposCuartos];
        cuartos = new String [equiposCuartos];
        semis = new String [equiposSemis];
        Final = new String [equiposFinal];   
    }
    
    /**************************************************************/
    
    public void simularCopa()
    {        
        System.out.println("******* ELIMINATORIAS COPA DEL REY *******");
        cuartos();
        semis();
        Final();
        ganador();             
    }
    
    /**************************************************************/
    
    public void cuartos()
    {
        int indice;        
        boolean repetido = false;
        
        System.out.println("");
        System.out.println("CUARTOS DE FINAL");
        System.out.println("----------------");
        
        for (int i = 0; i < equiposCuartos; i++)
        {
            repetido = false;
            
            while( repetido == false )
            {  
                indice = (int)(Math.random()*equiposCuartos);

                if( booleanos[indice] == false )
                {  
                    cuartos[i] = equipos[indice];
                    booleanos[indice] = true;
                    repetido = true;
                    
                    if(i % 2 == 0)
                    {
                        System.out.print(cuartos[i]+ " - ");
                    }else
                    {
                        System.out.println(cuartos[i]);
                    }  
                }
            }
        }
        System.out.println("");
    }
    
    /**************************************************************/
    
    public void semis()
    {
        int siguiente;
        int contador = 0;
        
        System.out.println("SEMIFINALES");
        System.out.println("-----------");
        
        for (int i = 0; i < equiposSemis; i++)
        {
            siguiente = comprobarResultado();
            
            if ( contador == 0 )
            {   
                semis[i] = cuartos[siguiente - 1];
                contador = contador + 2;
                
                if(i % 2 == 0)
                {
                    System.out.print(semis[i]+ " - ");
                }else
                {
                    System.out.println(semis[i]);
                }               
            }else
            {   
                if ( siguiente == 1 )
                {   
                    semis[i] = cuartos[contador];
                    contador = contador + 2;
                    
                    if(i % 2 == 0)
                    {
                        System.out.print(semis[i]+ " - ");
                    }else
                    {
                        System.out.println(semis[i]);
                    }
                   
                }else if ( siguiente == 2 )
                {  
                    semis[i] = cuartos[contador + 1];
                    contador = contador + 2;
                    
                    if(i % 2 == 0)
                    {
                        System.out.print(semis[i]+ " - ");
                    }else
                    {
                        System.out.println(semis[i]);
                    }
                }
            }
        }
        System.out.println("");
    }
    
    /**************************************************************/
    
    public void Final()
    {   
        int siguiente;
        int contador = 0;
        
        System.out.println("FINAL");
        System.out.println("-----");
        
        for (int i = 0; i < equiposFinal; i++)
        {
            siguiente = comprobarResultado();
            
            if ( contador == 0 )
            {   
                Final[i] = semis[siguiente - 1];
                contador = contador + 2;
                
                if(i % 2 == 0)
                {
                    System.out.print(Final[i]+ " - ");
                }else
                {
                    System.out.println(Final[i]);
                }                
            }else
            {
                if ( siguiente == 1 )
                {
                    Final[i] = semis[contador];
                    contador = contador + 2;
                    
                    if(i % 2 == 0)
                    {
                        System.out.print(semis[i]+ " - ");
                    }else
                    {
                        System.out.println(semis[i]);
                    }                    
                }else if ( siguiente == 2 )
                {   
                    Final[i] = semis[contador + 1];
                    contador = contador + 2;
                    
                    if(i % 2 == 0)
                    {
                        System.out.print(Final[i]+ " - ");
                    }else
                    {
                        System.out.println(Final[i]);
                    }
                }
            }
        }
        System.out.println("");
    }
    
    /**************************************************************/
    
    public void ganador()
    {
        int siguiente; 
        
        siguiente = comprobarResultado();

        System.out.println("¡¡CAMPEÓN!!");
        System.out.println("-----------");
        
        if ( siguiente == 1 )
        {
            System.out.println(Final[siguiente - 1]);

        }else if ( siguiente == 2 )
        {
            System.out.println(Final[siguiente - 1]);
        }        
    }
    
    /**************************************************************/
    
    public int comprobarResultado()
    {
        int puntuacion1;
        int puntuacion2;
        int siguiente = 1;
        boolean iguales = false;
        
        while ( iguales == false )
        {
            puntuacion1 = (int)(Math.random()*90+60);
            puntuacion2 = (int)(Math.random()*90+60);
            
            if ( puntuacion1 > puntuacion2 )
            {   
                siguiente = 1;
                iguales = true;

            }else if ( puntuacion1 < puntuacion2 )
            {
                siguiente = 2;
                iguales = true;
            }
        }
        return siguiente;
    }
}