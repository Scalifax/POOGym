package partnerships;

public class IndividualPartner extends Partner {
    
    // Attributes
    private int birth;

    // Constructors
    public IndividualPartner() {
        super();
        birth = 0;
    }

    public IndividualPartner(String name, int partnerNumber, String email, int discount, int birth) {
        super(name, partnerNumber, email, discount);
        this.birth = birth;
    }

    // Getters
    public int getBirth() {
        return birth;
    }

    // Setters
    public void setBirth(int birth) {
        this.birth = birth;
    }
}
