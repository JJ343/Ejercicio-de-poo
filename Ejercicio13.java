import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Double compra;
        String color;
        Scanner x=new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra:");
        compra=x.nextDouble();
        Scanner y=new Scanner(System.in);
        System.out.println("Ingrese el color de la bola:");
        color=y.nextLine();
        if (color.equals("Blanca")){;
            System.out.println("El valor a pagar es: "+compra);
        }else if(color.equals("Verde")){;
            compra=compra-(compra*0.10);
            System.out.println("El valor a pagar es: "+compra);
        }else if(color.equals("Amarilla")){;
            compra=compra-(compra*0.25);
            System.out.println("El valor a pagar es: "+compra);
        }else if(color.equals("Azul")){;
            compra=compra-(compra*0.50);
            System.out.println("El valor a pagar es: "+compra);
        }else if(color.equals("Roja")){;
            compra=compra-compra;
            System.out.println("El valor a pagar es: "+compra);
        }

    } 
}
