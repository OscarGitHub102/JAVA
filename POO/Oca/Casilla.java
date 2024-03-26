package POO.Oca;

public class Casilla
{
    private int casilla;
    private String tipo;
    private int siguiente;
    
    /**************************************************************/
    
    public Casilla(int casilla, String tipo, int siguiente)
    {
        this.casilla = casilla;
        this.tipo = tipo;
        this.siguiente = siguiente;        
    }
    
    /**************************************************************/

    public String getTipo() {
        return tipo;
    }

    /**************************************************************/
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}