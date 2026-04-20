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
    }

    public ServerConfig(String ip, int porta, String protocolo){
        this(ip);
        this.porta = porta;
        this.protocolo = protocolo;

    }

    private boolean validarPorta(int porta){
        if(porta>=1 && porta <=65535){return true;}
    }
}
