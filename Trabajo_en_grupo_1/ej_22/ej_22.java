package Trabajo_en_grupo_1.ej_22;

import java.util.Scanner;


public class ej_22 {
 public static void main(String[] args) {
    String nombre;
    double salario_bas, num_h, salario_men, dias;
    Scanner e = new Scanner(System.in);
    System.out.println("Escriba su nombre porfavor");
    nombre= e.nextLine();
    System.out.println("Escriba su salario basico por hora porfavor");
    salario_bas=e.nextDouble();
    System.out.println("Escriba su numero de horas trabajadas porfavor");
    num_h=e.nextDouble();
    System.out.println("Escriba el numero de dias que tiene el mes porfavor");
    dias=e.nextDouble();
    salario_bas=salario_bas*num_h;
    if (dias==31){
        salario_men=salario_bas*dias;
        if( salario_men > 450000){
            System.out.println( nombre +" tu salario mensual es "+ salario_men);
        }else{
            System.out.println(nombre);
        }
       
    }else{
        if(dias==30){
            salario_men=salario_bas*dias;
            if( salario_men > 450000){
                System.out.println( nombre +" tu salario mensual es "+ salario_men);
            }else{
                System.out.println(nombre);
            }
        }else{
            if(dias==28){
                salario_men=salario_bas*dias;
                if( salario_men > 450000){
                    System.out.println( nombre +" tu salario mensual es "+ salario_men);
                }else{
                    System.out.println(nombre);
                }
            }else{
                System.out.println("Ningun mes tiene esa cantidad de dias");
                
            }
        }
    }
 }
}  

