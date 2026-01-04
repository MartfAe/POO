

public class SomaDosNumerosInteirosPositivos {
    public static void main(String[] args) {
        int soma = 0;
        int numero = 10;
        do{
            soma+=numero;
            numero--;
        }while(soma <=10);
        System.out.println("Soma dos números inteiros positivos: " + soma);
    }
}
