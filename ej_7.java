package Trabajo_en_grupo_1.ej_7;

import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        double A, B ;
        Scanner e = new Scanner(System.in);
        System.out.println("Escriba porfavor el valor de A");
        A= e.nextDouble();
        System.out.println("Escriba porfavor el valor de B");
        B= e.nextDouble();
       if (A>B){
        System.out.print("A ES MAYOR QUE B");

       } else{
        if (A==B){
            System.out.print("A ES IGUAL A B");


        }else{
            System.out.print("A ES MENOR QUE B");
        }
        
       }
      

    }
    
    
    
    
}
