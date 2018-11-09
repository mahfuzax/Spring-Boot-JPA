package info.mahfuz.jpa.service;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {
    @Autowired
    PatientService patientService;

    @Test
    public void savePatient() {
        NoteMetadata metadata = new NoteMetadata();
        metadata.setProviderId(1);
        metadata.setPartnerId(1);
        metadata.setScribeId(1);

        Patient patient = new Patient();
        patient.setName("Patient 1");
        //patient.setMetadata(metadata);
        patientService.add(patient);
    }

}