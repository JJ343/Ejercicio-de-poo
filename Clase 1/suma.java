import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        double suma, X,Y;
        suma=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de X");
        X= entrada.nextDouble();
        System.out.println("Ingrese el valor de Y");
        Y=entrada.nextDouble();
        suma=suma+X;
        X= (X+Math.pow(Y,2));
        suma=suma+X/Y;
        suma=Math.round(suma*100.0)/100.0;
        System.out.println("El valor de la suma es " + suma);



    }
}
