package POO.CuadranteMatriz;

public class Cuadrante
{

    private int [][] c;
    
    /********************************************************************
    *********************************************************************/
    
    public Cuadrante(int [][] cuadro)
    {
        c = cuadro;
        visualizarCuadrante(c);
  }
    
    //********************************************************************
    
    public void visualizarCuadrante(int [][] c)
    {
        //System.out.print("[");
        
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(c[i][j]+ " ");
             }
            
            System.out.println("");
        }
        //System.out.print("]");
        System.out.println("---");
    }
}