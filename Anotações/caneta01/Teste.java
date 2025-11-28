package caneta01;

public class Teste {
    public static void main(String[] args){
        Caneta c1 = new Caneta("Bic Cristal", "Preta", 0.5f);
        c1.setModelo("Bic cristal");
        c1.setPonta(0.5f);
        c1.setCarga(5);
        c1.setCor("Preta");
        c1.setTampada(true);
        c1.status();
        
        Caneta c2 = new Caneta("Faber Castell", "Vermelha");
        c2.setTampada(false);
        c2.status();

    }

}
