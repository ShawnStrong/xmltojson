package xmltojson.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class PatientsXml {

    @JacksonXmlProperty(localName = "patient")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<PatientXml> patients = null;

    public void setPatients(List<PatientXml> patients) {
        this.patients = patients;
    }

    public List<PatientXml> getPatients() {
        return patients;
    }
}
