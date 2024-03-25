package POO.CuadranteMatriz;

public class Principal
{
        public static void main(String[] args)
        {
            int[][] m1 = {{2, 1, 2, 4}, {1, 4, 3, 2}, {4, 3, 4, 1}, {1, 1, 3, 2}};
            
            int[][] m2 = {{1, 2, 4, 4}, {2, 2, 1, 1}, {2, 3, 2, 1}, {2, 3, 1, 3}};
            
            int[][] m3 = new int[4][4];
            
            Matriz cuadrado1 = new Matriz(m1);
            
            System.out.println("");
            
            Matriz cuadrado2 = new Matriz(m2);
            
            Matriz.generarAleatoria(m3);
            
            System.out.println("");
            
            Matriz cuadrado3 = new Matriz(m3);
         }    
}