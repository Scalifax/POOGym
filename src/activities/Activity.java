package activities;

public class Activity {
    
    // Attributes
    private String name;
    private Instructor instructor;
    private String date;
    private String time;
    private int duration; // in minutes
    private int price;

    // Constructor
    public Activity() {
        this.name = "";
        this.instructor = null;
        this.date = "";
        this.time = "";
        this.duration = 0;
        this.price = 0;
    }
    
    public Activity(String name, Instructor instructor, String date, String time, int duration, int price) {
        this.name = name;
        this.instructor = instructor;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
