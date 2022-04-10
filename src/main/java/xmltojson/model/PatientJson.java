package xmltojson.model;

import java.text.ParseException;
import java.time.Year;

public class PatientJson {

    private int patientid;
    private String sex;
    private String state;
    private String name;
    private int age;

    public PatientJson(int patientid, String sex, String state, String name, String date) {
        this.patientid = patientid;
        this.sex = determineSex(sex);
        this.state = determineState(state);
        this.name = name;
        this.age = determineAge(date);
    }

    public int getPatientid() {
        return patientid;
    }

    public String getSex() {
        return sex;
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String determineSex(String sex) {
        switch (sex) {
            case "m": return "male";
            case "f": return "female";
            default: return "other";
        }
    }

    private String determineState(String state) {
        switch (state) {
            case "Michigan": return "MI";
            case "Ohio": return "OH";
            default: return "other";
        }
    }

    private int determineAge(String date) {
        return Year.now().getValue() - Integer.parseInt(date.substring(6));
    }

    @Override
    public String toString() {
        return String.format("patientid: %s, sex: %s, state: %s, name: %s, age: %s",
                this.patientid,
                this.sex,
                this.state,
                this.name,
                this.age);
    }
}
