package Enumeration;

enum DiaSemanaEnum {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};

public class DiaSemana
{
    public static void main(String[] args)
    {
        DiaSemanaEnum dia;                                              

        dia = DiaSemanaEnum.MARTES;

        switch (dia)
        {  
            case LUNES:
                System.out.println("Estamos a Lunes");
                break;
            case MARTES:
                System.out.println("Estamos a Martes");
                break;
            case MIERCOLES:
                System.out.println("Estamos a Miércoles");
                break;
            case JUEVES:
                System.out.println("Estamos a Jueves");
                break;
            case VIERNES:
                System.out.println("Estamos a Viernes");
                break;
            default:
                System.out.println("Estamos en fin de semana");
                break;
        }
        
        if (dia != DiaSemanaEnum.DOMINGO && dia != DiaSemanaEnum.SABADO)  
            System.out.println("Aún no ha llegado el fin de semana");
        
    }    
}