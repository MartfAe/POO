public class Carro {

    private String modelo;
    private String marcaDoCarro;
    private int anoDeFabricacao;

  
    public Carro(String modelo, String marcaDoCarro, int anoDeFabricacao){
        this.modelo = modelo;
        this.marcaDoCarro = marcaDoCarro;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public Carro(String modelo, String marcaDoCarro){
        this(modelo, marcaDoCarro, 0);
    }

      public Carro(){
        this("Desconhecido", "Desconhecido", 0);
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarcaDoCarro(){
        return marcaDoCarro;
    }
    public void setMarcaDoCarro(String marcaDoCarro){
        this.marcaDoCarro = marcaDoCarro;
    }
    public int getAnoDeFabricacao(){
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao){
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getDados(){
        return "Modelo:" + modelo + "\nMarca: " + marcaDoCarro + "\nAno de Fabricação: " + anoDeFabricacao + "\n____________________\n";
    }
        
    

}
