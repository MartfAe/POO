package heranca2;

public class Principal extends Animal {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r= new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();

        Cachorro cachorro = new Cachorro();
        Canguru canguru = new Canguru();
        Arara arara = new Arara();
        GoldenFish goldenFish = new GoldenFish();
        Tartaruga tartaruga = new Tartaruga();

        cachorro.setPeso(15.5f);
        cachorro.setCorPelo("Marrom");
        cachorro.setIdade(8);
        cachorro.locomover();
        cachorro.alimentar();
        cachorro.emitirSom();

        canguru.emitirSom();


        

    }
}
