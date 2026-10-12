package activities;

public class PersonalActivity extends Activity {
    
    // Attributes
    private PersonalActivityIntensity intensity;

    // Constructor
    public PersonalActivity() {
        super();
        this.intensity = PersonalActivityIntensity.NONE;
    }

    public PersonalActivity(String name, Instructor instructor, String date, String time, int duration, int price, PersonalActivityIntensity intensity) {
        super(name, instructor, date, time, duration, price);
        this.intensity = intensity;
    }

    // Getters
    public PersonalActivityIntensity getIntensity() {
        return intensity;
    }

     // Setters
    public void setIntensity(PersonalActivityIntensity intensity) {
        this.intensity = intensity;
    }
}
