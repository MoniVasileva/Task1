import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConnectionUri {
    String uriString;
    String user;
    String password;
    String URIString;
    String port;
    String host;

    public ConnectionUri(String uriString) {
        setUriString(uriString);
    }

    public String getUriString() {
        return uriString;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getURIString() {
        return URIString;
    }

    public String getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public void setUriString(String uriString) {
        if (uriString == null) {
            this.uriString = "";
        } else {
            this.uriString = validate(uriString,this.password,this.host,this.port);
        }
    }

    public String validate(String uriString, String password, String host,String port){
        Pattern pattern = Pattern.compile("([A-z1-9]+):([A-z1-9]+)@([A-z1-9]+):(\\d+)");
        Matcher matcher = pattern.matcher(uriString);
        if (matcher.find()){
            return uriString;
        }else {
            throw new IllegalArgumentException("Invalid uriString.");
        }

    }
    public ConnectionUri build(){
        return new ConnectionUri(uriString);
    }

}
