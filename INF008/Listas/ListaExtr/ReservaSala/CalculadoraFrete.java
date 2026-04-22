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
        }else{
            return peso * 5.9;
        }
    }

    public double calcularFrete(double peso, double distancia){
        if(peso<=0.0 || distancia<= 0.0){
            System.out.println("Valor inválido!");
        }else{
            return ((peso*2.0)+(distancia*0.5);
        }
    }

    public double calcularFrete(double peso, double distancia, String tipoDeEntrega){
       double valorBase = calcularFrete(peso, distancia);
       if(tipoDeEntrega.equalsIgnoreCase("expressa")){
        return valorBase*1.6
       }else if(tipoDeEntrega.equalsIgnoreCase("comum")){
        return valorBase*1.2;
       }
       return valorBase;
    }


    public double calcularFrete(double altura, double largura, double comprimento){}

}