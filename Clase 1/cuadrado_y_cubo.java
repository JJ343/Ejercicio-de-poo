import java.util.Scanner;

public class cuadrado_y_cubo {
    public static void main(String[] args) {
        double num, num_cua, num_cub;
        System.out.println("Escriba porfavor un numero");
        Scanner ent= new Scanner(System.in);
        num=ent.nextDouble();
        num_cua=Math.pow(num, 2);
        num_cub=Math.pow(num, 3);
        System.out.println("Este es su cuadrado "+num_cua);
        System.out.println("Este es su cubo "+num_cub);
    }
    
}
