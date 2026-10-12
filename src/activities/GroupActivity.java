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
    
    public GroupActivity(String name, Instructor instructor, String date, String time, int duration, int price, GroupActivityType type, int maxCapacity) {
        super(name, instructor, date, time, duration, price);
        this.type = type;
        this.maxCapacity = maxCapacity;
    }

    // Getters
    public GroupActivityType getType() {
        return type;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    // Setters
    public void setType(GroupActivityType type) {
        this.type = type;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }    
}
