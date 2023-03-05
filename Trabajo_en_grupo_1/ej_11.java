package Trabajo_en_grupo_1;

import java.util.Scanner;

public class ej_11 {
    public static void main(String[] args) {
        int n1, n2, n3, mayor;
        Scanner e  = new Scanner(System.in);
        System.out.println("Porfavor escriba el valor del primer entero");
        n1=e.nextInt();
        System.out.println("Porfavor escriba el valor del segundo entero");
        n2=e.nextInt();
        System.out.println("Porfavor escriba el valor del tercer entero");
        n3=e.nextInt();

        mayor=0;
        if (n1>n2 && n1>n3){
            mayor=n1;
    }else{ 
        if (n2>n3){
            mayor=n2;
        }else{
            mayor=n3;
        }

    }
    System.out.println("EL VALOR MAYOR ENTRE: "+ n1 +" "+n2+" Y "+n3+ " ES "+ mayor);
 }  
}
