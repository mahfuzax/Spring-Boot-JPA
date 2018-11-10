package info.mahfuz.jpa.service;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.Patient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;

public class PatientServiceTest extends BaseTest {
    @Autowired
    PatientService patientService;

    @Test
    public void savePatient() {
        NoteMetadata metadata = new NoteMetadata();
        metadata.setProviderId(1);
        metadata.setPartnerId(1);
        metadata.setScribeId(7);

        Patient patient = new Patient();
        patient.setName("Patient X");
        patient.setMetadata(metadata);
        patientService.add(patient);
    }

    @Test
    public void getPatient() {
        Optional<Patient> patient = patientService.get(1);
        assertNotNull(patient);
        patient.ifPresent(patient1 -> assertEquals(1, patient1.getId()));
    }
}