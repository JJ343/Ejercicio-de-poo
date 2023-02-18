import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  p, area;
        Scanner entrada =new Scanner(System.in);

        int l1=entrada.nextInt();
        int l2=entrada.nextInt();
        String universidad= entrada.next();
        p=2*l1+2*l2;
        area=l1*l2;
        System.out.println("El perimetro es "+p);
        System.out.println("El area es "+area);
        System.out.println(universidad);
    }

}
