public class Prontuario {
    private String matriculaAluno;
    private double peso;
    private  double altura;
    private String ultimaDataConsulta;


    public Prontuario(String matriculaAluno){
        this.matriculaAluno = matriculaAluno;
    }
  
    public Prontuario(String matriculaAluno, double peso, double altura, String ultimaDataConsulta){
        this(matriculaAluno);
        this.peso = peso;
        this.altura = altura;
        this.ultimaDataConsulta = ultimaDataConsulta;
    }



    public double calcularIMC(){
        if(altura<=0){return 0;}
        return peso/(altura*altura);
    }

    public String calcularIMC(boolean detalhado){
        double imc = calcularIMC();
        if(!detalhado) return String.format("%.2f", imc);
        
        if(imc<18,5) return "Abaixo do peso";
        if(imc <25) return "Peso ideal";
        if(imc < 30) return "Sobrepeso";
        return "Obesidade";
    }

    public void atualizarDados(double novoPeso, double novaAltura){
        if(novoPeso>0 && novaAltura>0){
            this.peso = novoPeso;
            this.altura = novaAltura;
        }
        else{
            System.out.println("ERRO: Valores inválidos.");
        }
    }

    public String getMatricula(){
        return matriculaAluno;
    }

   

}
