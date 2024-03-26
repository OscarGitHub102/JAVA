package POO.Oca;

public class Principal
{ 
    public static void main(String[] args)
    {
        Tablero tablero = new Tablero();
        
        tablero.crearLaberinto();
        tablero.elegirOca();
        tablero.elegirMuerte();
        tablero.simularJuego();
    }    
}