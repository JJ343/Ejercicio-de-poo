package Trabajo_en_grupo_1;

import java.util.Scanner;

public class ej_18{

    public static void main(String[] args) {
        String nombre, codigo;
        double horas_t, v_horas, retencion, salario_b, salario_n, fuente;
        Scanner ent = new Scanner(System.in);
        System.out.println("Escriba porfavor su nombre");
        nombre = ent.nextLine();
        System.out.println("Escriba porfavor su codigo");
        codigo = ent.nextLine();
        System.out.println("Escriba porfavor la cantida de horas trabajadas");
        horas_t = ent.nextDouble();
        System.out.println("Escriba porfavor el valor por hora");
        v_horas = ent.nextDouble();
        System.out.println("Escriba porfavor el pordentaje de retencion");
        fuente = ent.nextDouble();
        salario_b=horas_t*v_horas;
        retencion=salario_b*fuente;
        salario_n=salario_b-retencion;
        System.out.println("Tu codigo es " +codigo);
        System.out.println("Tu nombre es " +nombre);
        System.out.println("Tu salario bruto es " +salario_b);
        System.out.println("Tu salario neto es "+ salario_n);

        












        
    }
}