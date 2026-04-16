public class ItemPedido {
    
    private int id;
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    // Questão 13
    public void ItemPedido(int id, String nomeProduto, int quantidade, double precoUnitario){
        this.id = id;
        this.nomeProduto = nomeProduto;
        setQuantidade(quantidade);
        this.precoUnitario = precoUnitario;
    }
    // Questão 13
    public void ItemPedido(int quantidade, double precoUnitario){
        this(0, "Novo item", 1, 0.0);
    }

    //QUestão 14
    private boolean validarQuantidade(int qtd){
        return qtd>0;
    }

    
    private void setQuantidade(int quantidade){
        if(validarQuantidade(quantidade)){
            this.quantidade = quantidade;
        }else{
            this.quantidade = 1;
            System.out.println("Quantidade inválida. Definida como 1");
        }
    }

    //Questão 12
    public void aplicarDesconto(double porcentagem){
        if(porcentagem <=0 || porcentagem>100){
            this.precoUnitario -=(precoUnitario*(porcentagem/100));
        }
    }

    //Questão 12
    public void aplicarDesconto(double valorFixo, String cupom){
        if("PROMO10".equalsIgnoreCase(cupom)){
            this.precoUnitario -=valorFixo;
            if(this.precoUnitario <0)this.precoUnitario = 0;
        }
    }

    //Questão 15
    public double getValorTotal(){
        return this.quantidade * this.precoUnitario;
    }

    public double precoUnitario(){
        return precoUnitario;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }



}
