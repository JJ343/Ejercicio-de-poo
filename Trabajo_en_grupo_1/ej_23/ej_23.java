package Trabajo_en_grupo_1.ej_23;

import java.util.Scanner;

public class ej_23 {
    static double ecuacion_del_bachiller_p(double A, double B, double C){
        double v_1,x_1;
        x_1=Math.pow(B,2);
        v_1=(-B+Math.sqrt(x_1-4*A*C))/2*A;
        return v_1;

    }
    static double ecuacion_del_bachiller_n(double A, double B, double C){
        double v_2,x_2;
        x_2=Math.pow(B,2);
        v_2=(-B-Math.sqrt(x_2-4*A*C))/2*A;
        return v_2;
    }

    public static void main(String[] args) {
        double A, B, C, raiz_p, raiz_n;
        Scanner e = new Scanner(System.in);
        System.out.println("Digite el valor de A porfavor");
        A=e.nextDouble();
        System.out.println("Digite el valor de B porfavor");
        B=e.nextDouble();
        System.out.println("Digite el valor de C porfavor");
        C=e.nextDouble();
        if (A==0){
            System.out.println("Indefinido");
        
        }else{
            raiz_p=ecuacion_del_bachiller_p(A, B, C);
            raiz_n=ecuacion_del_bachiller_n(A, B, C);
            System.out.println("Las soluciones son: x1="+raiz_p+" x2="+raiz_n);
            
        }


    }

    
}
