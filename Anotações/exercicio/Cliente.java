package exercicio;

public class Cliente {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.setDono("João");
        c1.setNumConta(1111);
        c1.abrirConta("CC");

        Conta c2 = new Conta();
        c2.setNumConta(2222);
        c2.setDono("Maria");
        c2.abrirConta("CP");

        c1.depositar(600);
        c2.depositar(300);

        c1.estadoAtual();
        c2.estadoAtual();


        c1.sacar(1500);
        c2.sacar(50);

        c1.estadoAtual();
        c2.estadoAtual();

        c2.sacar(400);
        c2.fecharConta();

    }

}
