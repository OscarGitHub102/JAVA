package POO.FastFood;

public class Principal 
{
    public static void main(String[] args) 
    {
        Ternera  plato1 = new Ternera("simple",15.5,"Hamburguesa de ternera básica");
        Buey     plato2 = new Buey("doble",25.5,"Hamburguesa de ternera doble");
        MasaFina plato3 = new MasaFina("pequeña",16.75,"pizza masa fina tamaño pequeño");
        MasaFina plato4 = new MasaFina("mediana",25.0,"pizza masa fina tamaño mediano");
        MasaFina plato5 = new MasaFina("grande",31.25,"pizza masa fina tamaño grande");
        MasaGruesa plato6 = new MasaGruesa("pequeña", 20.0, "pizza masa gruesa tamaño pequeño");
        MasaGruesa plato7 = new MasaGruesa("mediana", 28.0, "pizza masa gruesa tamaño mediano");
        MasaGruesa plato8 = new MasaGruesa("grande", 33.60, "pizza masa gruesa tamaño grande");
        
        Cliente cliente = new Cliente("Pepe");
        
        cliente.hacerPedido(plato1);
        cliente.hacerPedido(plato3);
        cliente.hacerPedido(plato7);

        cliente.visualizarMisPlatos();
    }
}

