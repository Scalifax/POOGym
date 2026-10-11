package activities;

public class GroupActivity extends Activity {
    
    // Attributes
    private GroupActivityType type;
    private int maxCapacity;

    // Constructor
    public GroupActivity() {
        super();
        type = GroupActivityType.NONE;
        maxCapacity = 0;
    }
    
    public GroupActivity(String name, String instructor, String date, String time, int duration, int price, GroupActivityType type, int maxCapacity) {
        super(name, instructor, date, time, duration, price);
        this.type = type;
        this.maxCapacity = maxCapacity;
    }
}
