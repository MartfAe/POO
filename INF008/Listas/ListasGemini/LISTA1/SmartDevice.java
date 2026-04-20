public class SmartDevice {

    private String nome; 
    private String comodo; 
    private boolean status;
    private int consumoWatts;


    public void 

    public SmartDevice(String nome){
        this(nome, "Sala");
    }

    public SmartDevice(String nome, String comodo){
        this.nome = nome;
        this.comodo = comodo;
        this.status = false;
        this.consumoWatts = 0;
    }

    private void registrarAtividade(String acao){
        System.out.println("DISPOSITIVO: "+nome+" em "+comod+ ": "+acao);
    }

    public void ligar(){
        if(!status){
            this.status = true;
            registrarAtividade("Ligado Manualmente");
        }
    }


    public void ligar(int tempoMinutos){
        ligar();
        registrarAtividade("Programado para desligar em "+tempoMinutos+" minutos");
    }

    public void desligar(){
        if(status){
            this.status = false;
            registrarAtividade("Desligado");
        }
    }
}
