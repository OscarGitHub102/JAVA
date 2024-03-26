package POO.PC_Continentes;

public class Principal
{
    public static void main(String[] args) 
    {
        Tienda tienda = new Tienda("Pc-Continentes","Pepe Ruiz", 4);
        
        System.out.println("*********** PC CONTINENTES ***********");
        System.out.println("Añadiendo ordenadores ... \n");        
        tienda.annadir("HP", 16, "Intel iCore 7", "Windows", 1250.50);
        tienda.annadir("Toshiba", 32, "Intel iCore 7", "Windows", 1642.70);
        tienda.annadir("Lenovo", 32, "Intel iCore 7", "Linux", 875.0);
        tienda.annadir("IBM", 8, "AMD", "Windows", 475.50);
        System.out.println("");
        imprimirEstadoActual(tienda);
        tienda.annadir("xxx", 8, "xxx", "xxx", 1);
        tienda.eliminar("HP");
        imprimirEstadoActual(tienda);        
        tienda.eliminar("Lenovo");
        imprimirEstadoActual(tienda);        
    }

    /************************************************************/

    private static void imprimirEstadoActual(Tienda tienda)
    {
        System.out.println("Número de PCs actualmente a la venta : " + tienda.getNumOrdenadores());
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("ORDENADORES EN TIENDA");
        System.out.println("·····················");
        tienda.imprimirStock();
    }
}