

public class Triangulorectangulo {
    int base,altura;
    public Triangulorectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    double calcularArea(){
        return(base*altura/2);
    }
    double calcularHipotenusa(){
        return Math.pow(base*base + altura*altura, 0.5);
    }
    double calcularPerimetro(){
        return(base+altura+calcularHipotenusa());

    }

    public String determinarTipoTriangulo(){
        if((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa())){
            return "Es un triangulo equilatero";
        }else if((base!=altura)&&(base!=calcularHipotenusa())&&(altura!=calcularHipotenusa())){
           return "Es un triangulo escaleno";

        }else{
           return  "Es un triangulo isosceles";

        }

    }
}
    

