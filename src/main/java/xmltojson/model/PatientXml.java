package xmltojson.model;

public class PatientXml {

    private int id;
    private String gender;
    private String name;
    private String state;
    private String dob;

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return String.format("id: %s, gender %s, name: %s, state: %s, dob: %s",
                this.getId(),
                this.getGender(),
                this.getName(),
                this.getState(),
                this.getDob());
    }
}
