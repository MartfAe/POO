public class AgendamentoConsulta {

    double valor; 
    String paciente; 
    String especialidade; 
    String data; 

    public AgendamentoConsulta(String paciente){
        this.paciente = paciente;
    }
    public void atualizarConsulta(String paciente, String especialidade, String data, double valor){
        this.paciente = paciente; 
        this.especialidade = especialidade;
        this.data = data;
        this.valor = valor;
    }

    public AgendamentoConsulta valorConsulta(double valor){
        this.valor = valor;
        return this;
    }

    public AgendamentoConsulta definirEspecialidade(String especialidade){
        this.especialidade = especialidade;
        return this;
    }

    public void imprimirResumo() {
        System.out.println("--- Resumo do Agendamento ---");
        System.out.println("Paciente: " + this.paciente);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Data: " + this.data);
        System.out.println("Valor: R$ " + this.valor);
    }

    public static void main(String[] args) {
        AgendamentoConsulta agendamento1 = new AgendamentoConsulta("Maria");

        agendamento1.atualizarConsulta("Maria", "Cardiologista", "29/04/2026", 185.00);

        agendamento1.imprimirResumo();

        System.out.println("\n\nChamadas encadeadas");
        agendamento1.valorConsulta(140.0)
                    .definirEspecialidade("Neurologia");
        agendamento1.imprimirResumo();

    }
}
