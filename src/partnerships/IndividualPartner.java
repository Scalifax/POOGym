package partnerships;

public class IndividualPartner extends Partner {
    
    // Attributes
    private int birth;

    // Constructors
    public IndividualPartner() {
        super();
        birth = 0;
    }

    public IndividualPartner(String name, int partnerNumber, String email, int birth) {
        
        int discount = 0, age = 2026 - birth;

        if(age < 18) {
            discount = 10;
        } else if(age >= 65) {
            discount = 15;
        }

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

    // Methods

    @Override
    public String toString() {
        return "> Individual Partner: " + getName() + ", Partner Number: " + getPartnerNumber() 
                + ", Email: " + getEmail() + ", Birth Year: " + birth + ", Discount: " + getDiscount() + "%";
    }
}
