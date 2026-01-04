public class Produto {
    private String nome;
    private double preco;
    private int quantidadeNoEstoque;

    //Contructors
    public Produto(String nome, double preco, int quantidadeNoEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }
    public Produto(String nome, double preco){
        this(nome, preco, 0);
    }

    public Produto(){

    }

    // Getters e Setters

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public int getQuantidadeNoEstoque(){
        return quantidadeNoEstoque;
    }
    public void setQuantidadeNoEstoque(int quantidadeNoEstoque){
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }
    

}
