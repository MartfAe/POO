public class Reserva {

    String responsavel;
    Sala sala;

    public Reserva(String responsavel, Sala sala ){
        this.responsavel  = responsavel;
        this.sala  = sala;
    }

    public void trocarSala(Sala novaSala){
        this.sala =novaSala;
    }

    public void exibirInfoReserva(){
        System.out.println("O: "+responsavel+" trocou para a sala: "+sala);

    }
}
