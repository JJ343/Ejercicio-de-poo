

import java.util.Scanner;

public class ej_10 {
    public static void main(String[] args) {
        String num_ins, nombre;
        double estrato_social, patrimonio, pagmat;
        Scanner e  = new Scanner(System.in);
        System.out.println("Porfavor escriba su nombre");
        nombre= e.nextLine();
        System.out.println("Porfavor escriba su codigo");
        num_ins= e.nextLine();
        System.out.println("Porfavor escriba su estrato social");
        estrato_social= e.nextDouble();
        System.out.println("Porfavor escriba su capital");
        patrimonio= e.nextDouble();


        pagmat =50000;
        if (patrimonio>2000000 && estrato_social>3){
            pagmat= pagmat +0.03*patrimonio;
        } 
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " +num_ins+ " Y NOMBRE " + nombre + " DEBE PAGAR $"+ pagmat );
    }  
}
