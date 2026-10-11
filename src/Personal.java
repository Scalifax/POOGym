import java.util.*;

public class Personal{

    private String name;
    private String gender;
    private List<String> curriculum;

    // Constructors
    public Personal(){
        name = "";
        gender = "";
        curriculum = new ArrayList<>();
    }

    public Personal(String name, String gender, List<String> curriculum){
        this.name = name;
        this.gender = gender;
        this.curriculum = curriculum;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getCurriculum() {
        return curriculum;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCurriculum(List<String> curriculum) {
        this.curriculum = curriculum;
    }

    

    


}