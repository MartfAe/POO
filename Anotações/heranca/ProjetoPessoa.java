package heranca;

//Aluno, Professor e Funcionário, são heranças para diferença, pois são adicionados métodos além dos da superclasse. 

//Já funcionário, tem herança pobre, pois ele não adiciona nenhum método ou atributo além dos presentes na superclasse. 

public class ProjetoPessoa{
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno("Maria", 16, 'F', 202411, "Informática");
        Professor p3 = new Professor("Roberto", 35, 'M', 1500f, "Computação");
        Funcionario p4 = new Funcionario("Fabiana", 26, 'F', "Secretaria", true);

        p2.pagarMensalidade();

        p3.setSalario(2500.75f);
        System.out.println("Salário: " + p3.getSalario());
        p3.receberAumento(20);
        p4.setSetor("Coordenação");

        System.out.println("Salário: "+p3.getSalario());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        Visitante v1 = new Visitante();
        v1.setName("Juvenal");
        v1.setAge(22);
        v1.setSex('M');
        System.out.println(v1.toString());


        Bolsista b1 = new Bolsista();
        b1.setMatricula(1125);
        b1.setName("Jubileu");
        b1.setBolsa(552.25f);
        b1.setSex('M');
        b1.pagarMensalidade();
    }

}
