
public class AppConfig {
    private String appName;
    private String version;
    private int maxConnections; 
    private int timeOutSeconds;
    private boolean isDebugMode;

    public AppConfig(String appName, String version, int maxConnections, int timeOutSeconds, boolean isDebugMode){
        this.appName = appName;
        this.version = version;
        this.setMaxConnections(maxConnections);
        this.setTimeOutSeconds(timeOutSeconds); 
        this.isDebugMode= isDebugMode;
    }

    public AppConfig(String appName, String version, int maxConnections, int timeOutSeconds){
        this(appName, version, maxConnections, timeOutSeconds, false);
    }

    public AppConfig(String appName, String version ){
        this(appName, version, 150, 30, false );
    }

    public AppConfig(){
        this("My app", "2.1.0", 150, 30 ,false);
    }


    //GETTERS E SETTERS

    public String getAppName(){
        return appName;
    }

    public void setAppName(String appName){
        this.appName=appName;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String Version){
        this.version=version;
    }


    public int getMaxConnections(){
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections){
        if(maxConnections<=0){
            System.out.println("Invalid value!");
        }
        this.maxConnections = maxConnections;
    }

    public int getTimeOutSeconds(){
        return timeOutSeconds;
    }

    public void setTimeOutSeconds(int timeOutSeconds){
        if(timeOutSeconds<0){
            System.out.println("Invalid value!");
        }
        this.timeOutSeconds = timeOutSeconds;
    }

    public boolean isDebugMode(){
        return isDebugMode;
    }

    public void setIsDebugMode(boolean isDebugMode){
        this.isDebugMode = isDebugMode;
    }


    public void updateSettings(int maxConnections, int timeOutSeconds){
        setMaxConnections(maxConnections);
        setTimeOutSeconds(timeOutSeconds);
    }

    public void updateSettings(boolean isDebugMode){
        setIsDebugMode(isDebugMode);
    }


    public boolean validateConfig(){
        if(appName == null || appName.trim().isEmpty()) return false;
        if(version==null || version.trim().isEmpty()) return false;
        if(maxConnections<=0)return false; 
        if(timeOutSeconds < 0)return false; 
        return true;
    }
    

}

