import java.util.Scanner;

public class radio {
    public static void main(String[] args) {
        double radio, area, longitud;
        System.out.println("Ingrese el valor del radio");
        Scanner entrada= new Scanner(System.in);
        radio=entrada.nextDouble();
        area=Math.PI*Math.pow(radio, 2);
        longitud=2*Math.PI*radio;
        area=Math.round(area*100.0)/100.0;
        longitud=Math.round(longitud*100.0)/100.0;
        System.out.println("Esta es el area del circulo "+area);
        System.out.println("Esta es la longitud del circulo "+ longitud);

    }
    
}
