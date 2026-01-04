public class Bolo {

    int qtdAcucar;
    int qtdFarinha;
    int qtdOvos;

    public static void main(String[] args) {
        Bolo boloChocolate = new Bolo();
        boloChocolate.qtdAcucar = 200;
        boloChocolate.qtdFarinha = 300;
        boloChocolate.qtdOvos = 4;

        Bolo boloBaunilha = new Bolo();
        boloBaunilha.qtdAcucar = 150;
        boloBaunilha.qtdFarinha = 250;
        boloBaunilha.qtdOvos = 3;

        System.out.println("Bolo de Chocolate - Açúcar: " + boloChocolate.qtdAcucar + "g, Farinha: " + boloChocolate.qtdFarinha + "g, Ovos: " + boloChocolate.qtdOvos + " unidades");
        System.out.println("Bolo de Baunilha - Açúcar: " + boloBaunilha.qtdAcucar + "g, Farinha: " + boloBaunilha.qtdFarinha + "g, Ovos: " + boloBaunilha.qtdOvos + " unidades");

    }

}
