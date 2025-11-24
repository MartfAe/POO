import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c,d, resultado;

        System.out.println("Informe 4 valores:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        resultado = ((a*b)-(c*d));
        System.out.printf("\nResultado da diferença:%d", resultado);

        input.close();
    }

}
