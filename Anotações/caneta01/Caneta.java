package caneta01;

public class Caneta {
    public String modelo; 
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;


    public Caneta(String m, String c, float p, int carg){
        this.modelo = m;
        this.cor = c;
        this.ponta=p;
        this.tampar();   
   }

   public Caneta(String m, String c, float p){
    this(m, c, p, 8 );
   }

   public Caneta(String m, String c){
    this(m, c, 0.4f);
   }




    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public String getCor(){
        return this.cor;
    } 

    public void setCor(String c){
        this.cor = c;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public int getCarga(){
        return this.carga;
    }

    public void setCarga(int carg){
        this.carga= carg;
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public void setTampada(boolean t){
        this.tampada = t;
    }



    public void status(){
        System.out.println("Modelo: " + this.modelo);       
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: "+this.ponta);
        if(this.tampada==true){
        System.out.println("está tampada? Sim ");
    }else{
        System.out.println("Está tampada: não");
    }

        System.out.println("Qual a carga? " + this.carga+"\n");

    }

    public void rabiscar(){
        if(this.tampada == true || this.carga == 0 ){
            System.out.println("ERRO! Não posso rabiscar. Verificar carga ou se estou tampada");
        }else{
            System.out.println("\nEstou rabiscando");
        }

    }

    protected void tampar(){
        this.tampada = true;

    }

    protected void destampar(){
        this.tampada=false;

    }
}
