public class Sala {

    int capacidade; 
    boolean estaOcupada;
    String codigo;

    public Sala(int capacidade, String codigo){
        this.capacidade = capacidade;
        this.codigo = codigo;
        this.estaOcupada = false;
    }


    public void exibirInfo(){
        System.out.println("Sala: "+codigo+"\nCapacidade: "+ capacidade+"\nEstá ocupada: "+estaOcupada);
    }

    
}
