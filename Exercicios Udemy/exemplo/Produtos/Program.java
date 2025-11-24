package exemplo.Produtos;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe os dados do produto:");
        System.out.println("Name:");
        String name = input.nextLine();
       
        System.out.println("Price:");
        double price = input.nextDouble();
        
        System.out.println("Quantity in stock:");
        int quantity = input.nextInt();
        Product product = new Product(name, price,quantity);

        System.out.println("Product data: "+ product);

        System.out.println("Informe o número de produto para ser adicionado no stock:");
        quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println("Update product data: "+ product);

        System.out.println("Informe o número de produtos que deseja retirar do estoque:");
        quantity=input.nextInt();
        product.removeProduct(quantity);
        System.out.println("Remove product data: "+ product);

        input.close();
    }
}
