import java.io.Serializable;

public class Profile implements Serializable {
    private String name;
    private int age;
    private String hobby;
    private School school;

    public Profile(String name, int age, String hobby, School school) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
