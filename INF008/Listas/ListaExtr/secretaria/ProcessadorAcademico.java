package secretaria;
import cadastro.Aluno;
public class ProcessadorAcademico {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("João", 7.8);

        //Acessos permitidos 
        aluno1.nome = "João Silva";
        System.out.println("Nome alterado: "+aluno1.nome);

        //acesos não permitidos
        aluno1.notaFinal  = 10; // nota final é private

        aluno1.validarNota();//método private, não permite ser acessado
    }

}
