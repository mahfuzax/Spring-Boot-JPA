package info.mahfuz.jpa;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.Patient;
import info.mahfuz.jpa.service.NoteMetadataService;
import info.mahfuz.jpa.service.PatientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaApplicationTests {

    @Autowired NoteMetadataService noteMetadataService;
    @Autowired PatientService patientService;

    @Test
    public void contextLoads() {
    }

}
