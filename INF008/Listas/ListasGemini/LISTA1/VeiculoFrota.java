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

    public VeiculoFrota(String placa, String modelo){
        this(placa, modelo, 0, 0.0);
    }

    public void adcionarCarga(int quantidade){
        if(validarqtdCarga(quantidade)){
            setCargaCarregada(this.cargaCarregada + quantidade);
            System.out.println("Carga atualizada: " + getCargaCarregada());
        }
    }


    public void descarregar(int qtdCarga){
       int valorParaRemover = -Math.abs(qtdCarga)
       if(validarqtdCarga(valorParaRemover)){
        setCargaCarregada(this.cargaCarregada + valorParaRemover);
        System.out.println("Quantidade de carga atual:"+getCargaCarregada());
       }
        
    }

    public boolean validarqtdCarga(int qtdCarga){
        if(qtdCarga>0){
            if((this.cargaCarregada + qtdCarga)>this.capacidadeCarga){
                System.out.println("ERRO: Quantidade máxima ultrapassada!");
                return false;
            }
        }else if(qtdCarga<0){
            if (Math.abs(qtdCarga)>this.cargaCarregada){
                System.out.println("ERRO: Não a há carga carregada suficiente");
                return false;
            }
        }else{
            System.out.println("A quantidade de carga não pode ser zero");
            return false;
        }

        return true;
    }

    public int getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public int getCargaCarregada(){
        return cargaCarregada;

    }

    public void setCargaCarregada(int quantidadeCarga){
        this.cargaCarregada = quantidadeCarga;
    }

}
