import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int v1, v2, soma; 

        System.out.println("Informe dois valores:");
        v1 = input.nextInt();
        v2= input.nextInt();
        soma = v1 + v2;

        System.out.printf("Entrada:\nV1:%d\nV2:%d\n\nRESULTADO SOMA:%d", v1, v2, soma);
        input.close();
        

    }

}
