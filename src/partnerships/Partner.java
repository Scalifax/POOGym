package partnerships;

public class Partner {
    
    // Attributes
    private String name;
    private int partnerNumber;
    private String email;
    private int discount;

    // Constructors
    public Partner() {
        name = "";
        partnerNumber = 0;
        email = "";
        discount = 0;
    }

    public Partner(String name, int partnerNumber, String email, int discount) {
        this.name = name;
        this.partnerNumber = partnerNumber;
        this.email = email;
        this.discount = discount;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPartnerNumber() {
        return partnerNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getDiscount() {
        return discount;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPartnerNumber(int partnerNumber) {
        this.partnerNumber = partnerNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
