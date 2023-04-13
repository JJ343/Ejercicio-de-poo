public class algoritmo {

    public static Double valor(double salario_base,double num_horas){
        double valor;
        valor=salario_base*num_horas;
        return valor;
    }
    public static String trabajo(String nombre,Double salario){
        String x;
        if ( salario > 450000){
            x= String.valueOf(nombre)+ " tu salario mensual es "+ String.valueOf(salario);
        }else {
            x= String.valueOf(nombre);
        }
        return x;
    }
}
