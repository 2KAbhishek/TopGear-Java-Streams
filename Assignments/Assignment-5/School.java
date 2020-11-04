import java.io.Serializable;

public class School implements Serializable {
    private String nameOfSchool;
    private transient int yearStarted;

    public School(String nameOfSchool, int yearStarted) {
        this.nameOfSchool = nameOfSchool;
        this.yearStarted = yearStarted;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    @Override
    public String toString() {
        return "School [nameOfSchool=" + nameOfSchool + ", yearStarted=" + yearStarted + "]";
    }

}
