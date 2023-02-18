public class salario_bruto {
    public static void main(String[] args) {
        int salario_bruto;
        double salario_neto, retencion;
        salario_bruto=48*5000;
        retencion=salario_bruto*0.125;
        salario_neto=salario_bruto-retencion;
        System.out.println("El salario bruto es " +salario_bruto);
        System.out.println("La retencion es en la fuente es "+retencion);
        System.out.println("El salario neto es "+ salario_neto);;


    }
    
    
}
