package ClientWs;

import Proxy.BanqueService;
import Proxy.BanqueWs;

public class Client {
    public static void main(String[] args) {
        BanqueService obj =  new BanqueWs().getBanqueServicePort();
        System.out.println(obj.convertDh(88));
    }
}
