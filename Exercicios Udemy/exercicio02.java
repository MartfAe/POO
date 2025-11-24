import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area, pi, raio;
        pi = 3.14159;

        System.out.println("Informe o valor do raio:");
        raio = input.nextInt();
        area = pi*(raio*raio);
        System.out.printf("\nÁrea = %.4f", area);


        input.close();
        

    }

}
