package activities;

public class PersonalActivity extends Activity {
    
    // Attributes
    private PersonalActivityIntensity intensity; // (Later change this to the activityType class)

    // Constructor
    public PersonalActivity() {
        super();
        this.intensity = PersonalActivityIntensity.NONE;
    }

    public PersonalActivity(String name, String instructor, String date, String time, int duration, int price, PersonalActivityIntensity intensity) {
        super(name, instructor, date, time, duration, price);
        this.intensity = intensity;
    }
}
