public class persona {




    public static double salario_bruto(double horas_trabajadas, double valor_horas) {
        double salario_bruto;
        salario_bruto = horas_trabajadas * valor_horas;
        return salario_bruto;
    }

    public static double retencion(double salario_bruto, double fuente) {
        double retencion;
        retencion = salario_bruto * fuente;
        return retencion;
    }

    public static double salario_neto(double salario_bruto, double retencion) {
        double salario_neto;
        salario_neto = salario_bruto - retencion;
        return salario_neto;
    }
}










