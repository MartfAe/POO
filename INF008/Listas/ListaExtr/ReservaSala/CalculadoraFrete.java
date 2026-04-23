public class CalculadoraFrete{

    double peso;
    double distancia; 
    String tipoDeEntrega;
    double altura; 
    double largura; 
    double comprimento;

    public CalculadoraFrete(double peso, double distancia, String tipoDeEntrega){
        this.peso = peso;
        this.distancia = distancia;
        this.tipoDeEntrega = tipoDeEntrega;
    }

    public CalculadoraFrete(double peso, double distancia){
        this(peso, distancia, "COMUM");
    }

    public CalculadoraFrete(double peso){
        this(peso, 0.0, "COMUM");
    }


    public void tamanhoPacote(double altura, double largura, double comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }


    public double calcularFrete(double peso){
        if(peso<=0.0){
            System.out.println("Valor inválido, peso não pode ser negativo.");
            return 0.0;
        }else{
            return peso * 5.9;
        }
    }

    public double calcularFrete(double peso, double distancia){
        if(peso<=0.0 || distancia<= 0.0){
            System.out.println("Valor inválido!");
            return 0.0;
        }else{
            double valorBase = calcularFrete(peso);
            return valorBase+(distancia*0.5);
        }
    }

    public double calcularFrete(double peso, double distancia, String tipoDeEntrega){
       double valorBase = calcularFrete(peso, distancia);
       if(tipoDeEntrega.equalsIgnoreCase("expressa")){

        return valorBase *1.6;
       }
       return valorBase;
    }


    public double calcularFrete(double altura, double largura, double comprimento){
        double volume = altura*largura*comprimento;
        return volume *0.8;
    }

    public static void main(String[] args){
        CalculadoraFrete calculo1 = new CalculadoraFrete(25.5, 50);

        double freteSimples = calculo1.calcularFrete(calculo1.peso);
        double freteDistancia = calculo1.calcularFrete(calculo1.peso, calculo1.distancia);
        double freteTipo = calculo1.calcularFrete(calculo1.peso, calculo1.distancia, "expressa");
        double freteVolume = calculo1.calcularFrete(10.0, 5.0, 5.0);


       System.out.println("Peso do objeto: " + calculo1.peso + "kg");
        System.out.printf("Frete Simples: R$ %.2f%n",freteSimples);
        System.out.printf("Frete com Distância: R$ %.2f%n",freteDistancia);
        System.out.printf("Frete com distância e tipo: R$ %.2f%n",freteTipo);
        System.out.printf("Frete por Volume (10x10x10): R$ %.2f%n",freteVolume);
    }
}
