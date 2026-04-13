public class AppConfig {

    private String appName;
    private String version;
    private int maxConnections;
    private int timeOutSeconds;
    private boolean isDebugMode;


    public AppConfig(){
        this("DefaultApp", "1.0.0");

    }

    public AppConfig(String appName, String version){
        this(appName, version, 10, 30, false);
    }

    public AppConfig(String appName, String version, int maxConnections, int timeOutSeconds, boolean isDebugMode ){
        this.appName = appName;
        this.version = version;
        this.maxConnections=maxConnections;
        this.timeOutSeconds = timeOutSeconds;
        this.isDebugMode = isDebugMode;
    }
    

    public void updateSettings(int maxConnections, int timeOutSeconds){
        this.maxConnections = maxConnections;
        this.timeOutSeconds = timeOutSeconds;
        System.out.println("Conexões e Timeout atualizados.");
        
    }

    public void updateSettings(boolean isDebugMode){
        this.isDebugMode = isDebugMode;
    }

    public void validateConfig(){
        if(maxConnections>0 && timeOutSeconds>=0){
            System.out.println("Configuração válida para o app: "+appName);
        }else{
            System.out.println("Configuração inválida");
        }

    }

}
