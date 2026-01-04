package empresa;
import empresa.dados.*;

public class FolhaPagamento {


    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Carlos Silva", 30, "Analista de Sistemas", 4500.00, 5, 22);
        Estagiario estag1 = new Estagiario("Ana Souza", "2023001", "Ciência da Computação", 4, 1200.00, 20);

        double salarioFuncionario = func1.getSalario();
        double bolsaEstagiario = estag1.getBolsaAuxilio();
        double valeTransporteEstagiario = estag1.getValeTransporte();

        System.out.println("Folha de Pagamento:");
        System.out.println("Funcionário: " + func1.getNome() + " - Salário: R$ " + salarioFuncionario);
        System.out.println("Estagiário: " + estag1.getNome() + " - Bolsa Auxílio: R$ " + bolsaEstagiario + ", Vale Transporte: R$ " + valeTransporteEstagiario);

        func1.aumentarSalario(20);
        System.out.println("Após aumento, novo salário do Funcionário: R$ " + func1.getSalario());

        func1.alterarSalario(func1, 6000.00);
        System.out.println("Após alteração, novo salário do Funcionário: R$ " + func1.getSalario());

    }


}
