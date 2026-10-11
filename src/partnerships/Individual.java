package partnerships;

public class Individual extends Partner {
    
    // Attributes
    private int birth;

    // Constructors
    public Individual() {
        super();
        birth = 0;
    }

    public Individual(String name, int partnerNumber, String email, int discount, int birth) {
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
