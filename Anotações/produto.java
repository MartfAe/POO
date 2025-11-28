import java.util.Scanner;
public class produto {
        String name;
        double preco;
        int quantidade;
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        produto p = new produto();
        p.name = scanner.nextLine();
        p.name = "TV";
        p.preco = 898.99;
        p.quantidade = 5;

    }
}

