package xmltojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import xmltojson.model.PatientJson;
import xmltojson.model.PatientXml;
import xmltojson.model.PatientsXml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        File file = new File("patients.xml");

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        PatientsXml patientsXml = xmlMapper.readValue(file, PatientsXml.class);

        List<PatientJson> patientsJson = new ArrayList<>();

        for (PatientXml patientXml : patientsXml.getPatients()) {
            patientsJson.add(
                    new PatientJson(
                            patientXml.getId(),
                            patientXml.getGender(),
                            patientXml.getState(),
                            patientXml.getName(),
                            patientXml.getDob()));
        }

        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);

        jsonMapper.writeValue(new File("patients.json"), patientsJson);

    }
}
