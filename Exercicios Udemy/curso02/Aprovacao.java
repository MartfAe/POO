public class Aprovacao {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.5;
        int frequencia = 60;
        double media =(nota1 + nota2)/2;
        String resultado = (media >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("Média: " + media);
        System.out.println("Frequência: " + frequencia + "%");
        resultado = (frequencia >= 75) ? resultado : "Reprovado por frequência";
        System.out.println("Resultado final: " + resultado);
        

    }

}
