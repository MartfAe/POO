package INF008.provasPassadas;

public class Computer {

    private int ram; 
    private int ssd; 

    public Computer(int ram, int ssd){
        this.ram = ram; 
        this.ssd = ssd;
    }

    public Computer(int ram){
        this(ram, 256);
    }

    public Computer(){
        this(8,256);
    }

    public void saveFile(int size){ // Diminui o tamanho do ssd
        this.ssd-=size;
    }

    public void moveFrom(Computer fonte, int size){ // aumenta o tamanho do ssd fonte e diminui o tamanho do ssd que irá receber o arquivo
        fonte.ssd +=size; 
        this.saveFile(size);
    }

    public void moveTo(Computer alvo, int size){ // Diminui o tamanho do ssd alvo, que recebe e aumenta o tamanho do que enviou, a mesma coisa de cima mas invertido
        alvo.moveFrom(this, size);
    }

    public void display(){
        System.out.println("RAM: "+ this.ram+"Gb | SSD: "+this.ssd+"Gb");
    }


    public static void main(String[] args){
        Computer c1 = new Computer(32, 512);
        Computer c2 = new Computer(16);
        Computer c3 = new Computer();

        c1.saveFile(1); // diminui o tamanho do ssd 1
        c2.moveFrom(c1, 1); // Aumenta o tamanho de c1 e reduz o tamanho de c2

        c2.moveTo(c1, 2); // aumenta o tamanho de c2 e diminui o de c1

        c1.display();

        c2.display();

    }
}
