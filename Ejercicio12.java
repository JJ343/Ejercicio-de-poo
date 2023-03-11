import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        int horas,extra1,extra2,valor,tempo;
        String Nombre;
        Scanner x=new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador:");
        Nombre=x.nextLine();
        Scanner y=new Scanner(System.in);
        System.out.println("Ingrese el numero de horas trabajadas:");
        horas=y.nextInt();
        Scanner z=new Scanner(System.in);
        System.out.println("Ingrese el valor por hora:");
        valor=z.nextInt();
        if(horas<=40){;
        tempo=horas*valor;
        System.out.println("El trabajador "+Nombre+" devengo: "+tempo);
        }else if(horas>40 && horas<=48){;
        extra1=horas-40;
        extra1=extra1*(valor*2);
        horas=40;
        horas=(horas*valor)+extra1;
        System.out.println("El trabajador "+Nombre+" devengo: "+horas);
        }else if(horas>48){;
        extra2=horas-48;
        extra1=horas-40-extra2;
        extra1=extra1*(valor*2);
        horas=40;
        tempo=(horas*valor)+extra1;
        horas=40;
        horas=tempo+(extra2*(valor*3));
        System.out.println("El trabajador "+Nombre+" devengo: "+horas);
    
        }

    }
}