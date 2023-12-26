package WebService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;




    @WebService(serviceName ="BanqueWs")
    public class BanqueService {
        @WebMethod(operationName = "ConvertDh")
        //conversion(double mt):double
        public double conversion(@WebParam(name ="montant") double mt){
            double rst;
            rst=mt*11;
            return rst ;
        }
        //Compte getCompte()
        @WebMethod
        public Compte getCompte(@WebParam int code) {
            return new Compte(111,10);
        }
        @WebMethod
        //List<Compte> getComptes()
        public List<Compte> getComptes() {
            List<Compte> comptes = new ArrayList<>();
            comptes.add(new Compte(111, 12));
            comptes.add(new Compte(222, 20));
            comptes.add(new Compte(333, 30));


            return comptes;
        }
    }

