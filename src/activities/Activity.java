package activities;

public class Activity {
    
    // Attributes
    private String name;
    private String instructor; // (Later change this to the instructor class)
    private String date;
    private String time;
    private int duration; // in minutes
    private int price;

    // Constructor
    public Activity() {
        this.name = "";
        this.instructor = "";
        this.date = "";
        this.time = "";
        this.duration = 0;
        this.price = 0;
    }
    
    public Activity(String name, String instructor, String date, String time, int duration, int price) {
        this.name = name;
        this.instructor = instructor;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.price = price;
    }
}
