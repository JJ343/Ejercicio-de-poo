public class cuadratica {
    public static  double ecuacion_p(double A, double B, double C){
        double v_1, x_1;
        x_1=Math.pow(B,2);
        v_1=(-B+Math.sqrt(x_1-4*A*C))/2*A;
        return v_1;
    }
    public static  double ecuacion_n(double A, double B, double C){
       double v_2, x_2;
       x_2=Math.pow(B,2);
       v_2=(-B-Math.sqrt(x_2-4*A*C))/2*A;
       return  v_2;
    }




}
