import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Double d1,d2,d3,salario,total;
        Scanner x=new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1:");
        d1=x.nextDouble();
        Scanner y=new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 2:");
        d2=y.nextDouble();
        Scanner z=new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 3:");
        d3=z.nextDouble();
        Scanner a=new Scanner(System.in);
        System.out.println("Ingrese el salario de los vendedores:");
        salario=a.nextDouble();
        total=d1+d2+d3;
        if (d1>(total*0.33)){;
            System.out.println("El salario de los vendedores del departamento 1 es :"+(salario+(salario*0.20)));
        }else if(d1<(total*0.33)){;
            System.out.println("El salario de los vendedores del departamento 1 es :"+(salario));
        } if (d2>(total*0.33)){;
            System.out.println("El salario de los vendedores del departamento 2 es :"+(salario+(salario*0.20)));
        }else if(d1<(total*0.33)){;
            System.out.println("El salario de los vendedores del departamento 2 es :"+(salario));
        } if (d3>(total*0.33)){;
            System.out.println("El salario de los vendedores del departamento 3 es :"+(salario+(salario*0.20)));
        }else if(d3<(total*0.33)){;
            System.out.println("El salario de los vendedores del departamento 3 es :"+(salario));
        }


        


    }
    
}
