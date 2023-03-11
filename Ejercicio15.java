import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Double a,b,c,d;
        Scanner x=new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A:");
        a=x.nextDouble();
        Scanner y=new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera B:");
        b=y.nextDouble();
        Scanner z=new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera C:");
        c=z.nextDouble();
        Scanner f=new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera D:");
        d=f.nextDouble();
        if(a.equals(b) && a.equals(c)){
            if(d>a){
                System.out.println("La esfera d es diferente y es de mayor peso");
            }else if(d<a){;
                System.out.println("La esfera d es diferente y es de menor peso");
            }
        }else if(a.equals(c) && a.equals(d)){
            if(b>a){
                System.out.println("La esfera b es diferente y es de mayor peso");
            }else if(b<a){;
                System.out.println("La esfera b es diferente y es de menor peso");
            }
        }else if(a.equals(b) && a.equals(d)){
            if(c>a){
                System.out.println("La esfera c es diferente y es de mayor peso");
            }else if(c<a){
                System.out.println("La esfera c es diferente y es de menor peso");
            }
        }else{
            if(a>b){
                System.out.println("La esfera a es diferente y es de mayor peso");
            }else if(a<b){
                System.out.println("La esfera a es diferente y es de menor peso");
            }
        }
    }
    
}
