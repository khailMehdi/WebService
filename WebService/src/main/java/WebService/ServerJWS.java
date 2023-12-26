package WebService;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:8888/";
        BanqueService obj=new BanqueService();
        Endpoint.publish(url,obj);
        System.out.println("Web Service Done "+url);

    }
}
