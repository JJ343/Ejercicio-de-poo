public class Mayor_que {

    public  static  String mayor(double numero1, double numero2){

        if (numero1>numero2){
            return  String.valueOf(numero1);
        }else {
            if (numero1==numero2){
                return "Tienen el mismo valor";
            }else {
                return  String.valueOf(numero2);
            }
        }
    }
}
