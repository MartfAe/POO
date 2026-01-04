public class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco;

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao < 0){
            System.out.println("Ano de publicação inválido.");
            return;
        }
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("Preço não pode ser negativo.");
            return;
        }
        this.preco = preco;
    }
    //Construtores
    

    public Livro(){
        this("Desconhecido", "Desconhecido", 0, 0.0);   

    }

    public Livro(String titulo, String autor, int anoPublicacao, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public Livro(String titulo, String autor){
        this(titulo, autor, 0, 0.0);
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Preço: R$" + preco);
        System.out.println("---------------------------");
    }


}
