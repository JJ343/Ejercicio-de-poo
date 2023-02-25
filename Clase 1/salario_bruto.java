import java.util.Scanner;

public class salario_bruto {
    public static void main(String[] args) {
        double salario_neto, salario_bruto, retencion, horas,valor, fuente;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas");
        horas=entrada.nextDouble();
        System.out.println("Ingrese el valor por hora");
        valor=entrada.nextDouble();
        System.out.println("Ingrese la rentencion en la fuente(porfavor digitelo en forma decimal. ejp:0,125 =12.5%)");
        fuente=entrada.nextDouble();

        salario_bruto=valor*horas;
        retencion=salario_bruto*fuente;
        salario_neto=salario_bruto-retencion;
        System.out.println("El salario bruto es " +salario_bruto);
        System.out.println("La retencion es en la fuente es "+retencion);
        System.out.println("El salario neto es "+ salario_neto);;


    }
    
    
}
