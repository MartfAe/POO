public class ServerConfig {
    private String ip;
    private int porta;
    private String protocolo;

    public String getIp(){
        return ip;
    }

    public int getPorta(){
        return porta;
    }

    public String getProtocolo(){
        return protocolo;
    }

    public ServerConfig(String ip){
        this.ip = ip;
        this.porta = 80;
        this.protocolo = "HTTP";
    }

    public ServerConfig(String ip, int porta, String protocolo){
        this(ip);
        if(validarPorta(porta)){
            this.porta = porta;
        }else{
            System.out.println("VALOR INVÁLIDO!");
        }
        this.protocolo = protocolo;

    }

    private boolean validarPorta(int porta){
        return porta>=1 && porta <=65535;
    }
}
