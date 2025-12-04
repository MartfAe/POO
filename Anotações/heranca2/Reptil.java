package heranca2;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }

    @Override 
    public void alimentar(){
        System.out.println("Comendo ratinhos.");
    }

    @Override
    public void emitirSom(){
        System.out.println("Sibilando");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }



}
