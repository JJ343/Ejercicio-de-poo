package Trabajo_en_grupo_1.ej_24;

import java.util.Scanner;

public class ej_24 {
    public static void main(String[] args) {
        double A,B, C, mayor;
        Scanner e = new Scanner(System.in);
        System.out.println("Digite el peso de la esfera A porfavor");
        A=e.nextDouble();
        System.out.println("Digite el peso de la esfera B porfavor");
        B=e.nextDouble();
        System.out.println("Digite el peso de la esfera C porfavor");
        C=e.nextDouble();
        mayor=0;
        if (A>B && A>C){
            mayor=A;
            System.out.println("La esfera mas pesada es la esfera A con: "+ mayor+ " de peso");
    }else{ 
        if (B>C){
            mayor=B;
            System.out.println("La esfera mas pesada es la esfera B con: "+ mayor+ " de peso");
        }else{
            mayor=C;
            System.out.println("La esfera mas pesada es la esfera C con: "+ mayor+ " de peso");
        }

    }
    
        
    }
    
    
}
