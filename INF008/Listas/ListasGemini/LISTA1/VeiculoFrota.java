public class VeiculoFrota {

    private String placa;
    private String modelo;
    private int capacidadeCarga;
    private int cargaCarregada;
    private double quilometragem;


    public VeiculoFrota(String placa, String modelo, int capacidadeCarga, double quilometragem){
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.quilometragem = quilometragem;
    }

    public VeiculoFrota(String placa, String modelo, int capacidadeCarga){
        this(placa, modelo, capacidadeCarga, 0);
    }

    public int getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public int getCargaCarregada(){
        return cargaCarregada;

    }




    public VeiculoFrota(String placa, String modelo){
        this(placa, modelo, 0, 0.0);
    }

    public void adcionarCarga(int qtdCarga){
        if(qtdCarga<=0){
            System.out.println("ERRO: Valor inválida, a qtd de carga não pode ser menor ou igual a zero.");
            return;
        }else if((this.cargaCarregada + qtdCarga)>this.capacidadeCarga){
            System.out.println("ERRO: Capacidade de carga ultrapassada.");
        }else{
            this.cargaCarregada += qtdCarga;
            System.out.println("Carga carregada com sucesso");
        }
    }

    public void descarregar(int qtdCarga){
        
    }

}
