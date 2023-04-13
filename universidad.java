public class universidad {
    public static double pagar(double patri, int estrato){
        double x;
        x=50000;
        if (patri>2000000 && estrato>3){
            x=x + 0.03*patri;
        }
        return x;
    }
}
