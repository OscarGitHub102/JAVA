package POO.CuentasCorrientes;

public class Cuenta
{    
    private String titular;
    private double saldo = 0;
    private boolean alarma = false;
    
    public void ingresar (double cantidad)
    {
        if(cantidad > 0)
        {
            this.saldo = cantidad + this.saldo;
            System.out.println("Ha sido agregado satisfactoriamente");
            System.out.println("Saldo actual de " +getTitular()+ " (después de la operación): " +saldo);
        }
        System.out.println("");
    }
    
    public void retirar(double cantidad)
    {           
        if((this.saldo - cantidad) < 0)
        {
            alarma = true;
            System.out.println("SALDO NEGATIVO");
            
            if(this.saldo - cantidad > -50)
            {
                this.saldo = this.saldo - cantidad;
                System.out.println("Ha sido retirado satisfactoriamente");
                System.out.println("Saldo actual de " +getTitular()+ " (después de la operación): " +saldo);
            }else
                System.out.println("SALDO MENOR DE 50 EUROS, NO SE PUEDE HACER EL RETIRO");
        }else
        {
            System.out.println("Saldo actual de " +getTitular()+ " (después de la operación): " +(saldo-cantidad));
        }
    }
    
    public Cuenta(String titular)
    {
        this.titular = titular;   
    }
    
    public Cuenta(String titular, double saldo)
    {
        this.titular = titular;
        this.saldo = saldo;   
    }
    
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAlarma() {
        return alarma;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + ", alarma=" + alarma + '}';
    }
 
    
}