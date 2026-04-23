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

    public void saveFile(int size){
        this.ssd-=size;
    }

    public void moveFrom(Computer fonte, int size){
        fonte.ssd +=size; 
        this.saveFile(size);
    }

    public void moveTo(Computer alvo, int size){
        alvo.moveFrom(this, size);
    }

    public void display(){
        System.out.println("RAM: "+ this.ram+"Gb | SSD: "+this.ssd+"Gb");
    }


    public static void main(String[] args){
        Computer c1 = new Computer(32, 512);
        Computer c2 = new Computer(16);
        Computer c3 = new Computer();

        c1.saveFile(1);
        c2.moveFrom(c1, 1);

        c2.moveTo(c1, 2);

        c1.display();

        c2.display();

    }
}
