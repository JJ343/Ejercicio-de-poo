package Trabajo_en_grupo_1.ej_19;

import java.util.Scanner;

public class ej_19 {
    static double perimetro(double n){
        double valor;
        valor = 3*n;
        return valor;
    }
    static double area(double n){
        double v_1;
        v_1= (Math.sqrt(3)/4)*Math.pow(n,2);
        return v_1;
    }

    public static void main(String[] args) {
        double lado, perimetro, altura, area;
        Scanner e = new Scanner(System.in);
        System.out.println("Escriba porfavor el valor de uno de los lados del triangulo equilatero");
        lado= e.nextDouble();
        altura=(lado*Math.sqrt(3))/2;
        perimetro= perimetro(lado);
        area= area( lado);
        altura=Math.round(altura*100.0)/100.0;
        area= Math.round(area*100.0)/100.0;
        System.out.println("La altura del traingulo es " +altura);
        System.out.println("El perimetro del traingulo es " +perimetro);
        System.out.println("El area del triangulo es " + area);


    }
   

    
}
