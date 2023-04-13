public class Triangulo_equilatero {

    public  static double perimetro(double lado){
        double valor;
        valor=3*lado;
        return valor;

    }
    public  static  double area(double lado){
        double v_1;
        v_1=(Math.sqrt(3)/4)*Math.pow(lado,2);
        v_1=Math.round(v_1*100.0)/100.0;
        return v_1;
    }
    public  static  double altura(double lado){
        double x;
        x=(lado*Math.sqrt(3))/2;
        x=Math.round(x*100.0)/100.0;
        return x;

    }

}
