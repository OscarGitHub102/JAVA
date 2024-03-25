package POO.ListaReproduccionAleatoria;

public class Principal
{
    static int tamanio = 10;
    
    public static void main(String[] args)
    {
    
        Lista miLista = new Lista(tamanio);
        miLista.getClass();
        
        miLista.crearListaDeDistribucion();
        miLista.visualizarLista();
        
    }
    
}