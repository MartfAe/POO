public class VeiculoFrota {

    private String placa;
    private String modelo;
    private int capacidadeCarga;
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

    public VeiculoFrota(String placa, String modelo){
        this(placa, modelo, 0, 0.0);

    public void adcionarCarga(int qtdCarga){
        if(qtdCarga<=0){
            System.out.println("Valor inválido.");
    }else{
        
    }
}

}
