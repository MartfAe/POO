public class ProdutoEstoque {
    String nome; 
    int quantidadeInicial; 
    float precoUnitario;
    int codigo;

    public ProdutoEstoque(int codigo, String nome, int quantidadeInicial, float precoUnitario){
        this.codigo = codigo; 
        this.nome = nome;
        this.quantidadeInicial=((quantidadeInicial>=0) ? quantidadeInicial : 0); 
        this.precoUnitario = precoUnitario;
    }


    public ProdutoEstoque(int codigo, String nome, int quantidadeInicial){
        this(codigo, "Item genérico", 0, 0.0f);
    }


    public ProdutoEstoque(int codigo, String nome){
        this(codigo, nome, 0, 0.0f);
    }

    public void exibirInfo(){
        System.out.println("Produto: " + nome+" | Código: "+codigo+" | Quantidade inicial: "+quantidadeInicial+" | Preço Unitário: "+ precoUnitario);
    }

    public static void main(String[] args){

        ProdutoEstoque produto1 = new ProdutoEstoque(7456, "TV");

        produto1.exibirInfo();

        ProdutoEstoque produto2 = new ProdutoEstoque(654, "ar condicionado", 5 , 25.50f);
        produto2.exibirInfo();

        ProdutoEstoque produto3 = new ProdutoEstoque(23534, "Impressora", 6 , 1453.67f);
        produto3.exibirInfo();
    }
    
}
