public class Main {
    public static void main(String[] args) {
        Sala sala1 = new Sala(30, "A1");
        Reserva reserva1 = new Reserva("Maria", sala1);

        Sala ref1 = sala1;
        Sala ref2 = sala1;

        System.out.println("Exibindo informação referência 1:");
        ref1.exibirInfo();
        ref1.estaOcupada = true;
        System.out.println("Exibir informação ref2:");
        ref2.exibirInfo();

        Sala sala2 = new Sala(20, "A2");
        reserva1.trocarSala(sala2);
        reserva1.exibirInfoReserva();

        Sala copiaRef= sala2;


        System.out.println("CopiaRef == sala2?"+(copiaRef==sala2));

        Sala sala3 = new Sala(20, "A2");
        System.out.println("Sala3 == Sala2?" +(sala3 == sala2));



    }

}
