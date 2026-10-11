package partnerships;

public class BusinessPartner extends Partner {
    
    // Attributes
    private String nif;

    // Constructors
    public BusinessPartner() {
        super();
        nif = "";
    }

    public BusinessPartner(String name, int partnerNumber, String email, int discount, String nif) {
        super(name, partnerNumber, email, discount);
        this.nif = nif;
    }

    // Getters
    public String getNif() {
        return nif;
    }

    // Setters
    public void setNif(String nif) {
        this.nif = nif;
    }
}
