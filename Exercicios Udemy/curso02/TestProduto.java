public class TestProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.0, 5);
        Produto produto2 = new Produto("Smartphone", 2000.0);

        System.out.println("Produto 1: " + produto1.getNome() + ", Preço: " + produto1.getPreco() + ", Quantidade no Estoque: " + produto1.getQuantidadeNoEstoque());
        System.out.println("Produto 2: " + produto2.getNome() + ", Preço: " + produto2.getPreco() + ", Quantidade no Estoque: " + produto2.getQuantidadeNoEstoque());

        produto1.setQuantidadeNoEstoque(10);
        produto2.setNome("Iphone 15Pro");
        produto2.setQuantidadeNoEstoque(20);

        System.out.println("Após atualização:");
        System.out.println("Produto 1: " + produto1.getNome() + ", Preço: " + produto1.getPreco() + ", Quantidade no Estoque: " + produto1.getQuantidadeNoEstoque());
        System.out.println("Produto 2: " + produto2.getNome() + ", Preço: " + produto2.getPreco() + ", Quantidade no Estoque: " + produto2.getQuantidadeNoEstoque());

    }

}
