package WebService;

public class Compte {
    private int code ;
    private double solde ;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }
    public Compte(){

    }
}