public class Post {

    private String conteudo;
    private String autor;
    private int curtidas;
    private boolean publico;

    public Post(String conteudo, String autor){
        this(conteudo, autor, true);
    }

    public Post(String conteudo, String autor, boolean publico){
        if(conteudo == null || autor == null) return;
        this.conteudo = conteudo;
        this.autor = autor; 
        this.publico = publico;
        this.curtidas = 0;
    }


    private boolean validarQuantidade(int quantidade){
        return quantidade>0;
    }

    public void curtir(){
        this.curtir(1);
    }

    public void curtir(int quantidade){
        if(!validarQuantidade(quantidade))return;
        this.curtidas+=quantidade;
    }

    private void validarConteudo(String conteudo){
        if(conteudo == null || conteudo.trim().isEmpty()){
            throw new IllegalArgumentException("Conteúdo não pode ser vazio");
        }
    }


}
