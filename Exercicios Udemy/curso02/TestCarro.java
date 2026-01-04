public class TestCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Model S", "Tesla", 2020);
        Carro carro2 = new Carro("Civic", "Honda");
        Carro carro3 = new Carro("HB20", "Hyundai", 2022);

        System.out.println("Carro 1: " + carro1.getDados());
        System.out.println("Carro 2: " + carro2.getDados());
        System.out.println("Carro 3: " + carro3.getDados());

        carro1.setAnoDeFabricacao(2021);
        carro2.setModelo("Civic LX");
        carro2.setAnoDeFabricacao(2019);

        System.out.println("Após atualização:\n");
        System.out.println("Carro 1: " + carro1.getDados());
        System.out.println("Carro 2: " + carro2.getDados());
    }

}
