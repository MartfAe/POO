public class ContaConsumoEnergia {

    int numeroInstalacao;
    String nomeTitular; 
    int consumo; 
    double tarifaBase; 
    String bandeiraTarifaria; 


    public ContaConsumoEnergia(int numeroInstalacao, String nomeTitular,double tarifaBase, String bandeiraTarifaria ){
        this.numeroInstalacao = numeroInstalacao;
        this.nomeTitular = nomeTitular;
        this.consumo = 0; 
        this.tarifaBase = tarifaBase;
        this.bandeiraTarifaria = bandeiraTarifaria;
        
    }

    public void novoConsumoEnergia(int novoConsumo){
        if(novoConsumo<=0){
            System.out.println("Erro: valor inválido");
        }else{
            this.consumo = novoConsumo;
        }
    }

    public double calcularConta(){
        double valorTotal = this.consumo * this.tarifaBase;
        if(this.bandeiraTarifaria.equalsIgnoreCase("Vermelha")){
            valorTotal += (this.consumo*0.1);
        }else if(this.bandeiraTarifaria.equalsIgnoreCase("Amarela")){
            valorTotal +=(this.consumo*0.05);
        }

        return valorTotal;
    }

    public double aplicarDesconto(int porcentagem){
        if(porcentagem >25){
            System.out.println("Erro: Porcentagem maior que 25%.");
            return calcularConta();
        }
        double valorOriginal = calcularConta();
        double valorComDesconto = valorOriginal -(valorOriginal*(porcentagem/100.0));
        return valorComDesconto;

    }

    public void exibirInfo(){
        double valorFinal = calcularConta();
        System.out.println("------INFORMAÇÕES CONTA------\n");
        System.out.println("TITULAR:" +nomeTitular);
        System.out.println("\nNÚMERO INSTALAÇÃO: "+ numeroInstalacao);
        System.out.println("\nCONSUMO: "+consumo);
        System.out.println("BANDEIRA TARIFÁRIA: "+ bandeiraTarifaria);
        System.out.println("VALOR DA CONTA: "+ valorFinal);
    }

    public static void main(String[] args){
        ContaConsumoEnergia conta1 = new ContaConsumoEnergia(1234, "Ana", 5.5, "Amarela");

        conta1.novoConsumoEnergia(60);
        System.out.println("Antes do desconto:\n");
        conta1.calcularConta();
        conta1.exibirInfo();
        System.out.println("Depois do desconto:\n");
        System.out.println("Valor conta com desconto: "+String.format("%.2f", conta1.aplicarDesconto(10)));
    }
}


