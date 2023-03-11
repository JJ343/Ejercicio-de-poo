

import java.util.Scanner;

public class ej_21 {
    static double perimetro(double a,double b,double c){
        double v_1;
        v_1=a +b +c;
        return v_1;
    }
    static double Semiperimetro(double n){
        double v_2;
        v_2= n/2;
        return v_2;
    }
    static double area(double a, double b, double c, double s){
        double v_3;
        v_3= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return v_3;
    }

    public static void main(String[] args) {
        double lado_1, lado_2, lado_3, perimetro, semi_p, area ;
        Scanner e = new Scanner(System.in);
        System.out.println("Escriba porfavor el valor del lado 1");
        lado_1=e.nextDouble();
        System.out.println("Escriba porfavor el valor del lado 2");
        lado_2=e.nextDouble();
        System.out.println("Escriba porfavor el valor del lado 3");
        lado_3=e.nextDouble();
        perimetro= perimetro(lado_1, lado_2, lado_3);
        semi_p= Semiperimetro(perimetro);
        area= area(lado_1, lado_2, lado_3, semi_p);
        area= (Math.round(area*100.0))/100.0;
        System.out.println("El perimetro del traingulo es " +perimetro);
        System.out.println("El semiperimetro es " +semi_p);
        System.out.println("El area del triangulo es " + area);

    }
    
}
