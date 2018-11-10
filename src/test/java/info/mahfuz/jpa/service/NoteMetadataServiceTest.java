package info.mahfuz.jpa.service;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.Patient;
import info.mahfuz.jpa.model.SearchCriteria;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class NoteMetadataServiceTest extends BaseTest {

    @Autowired
    NoteMetadataService noteMetadataService;
    @Test
    public void saveNoteMetadata() {
        NoteMetadata metadata = new NoteMetadata();
        metadata.setProviderId(1);
        metadata.setPartnerId(1);
        metadata.setScribeId(1);

        Patient patient = new Patient();
        patient.setName("Patient 1");
        patient.setMetadata(metadata);

        metadata.setPatient(patient);

        noteMetadataService.add(metadata);

        assertEquals(patient.getMetadata().getId(), metadata.getId());
    }

    @Test
    public void getNoteMetadata() {
        Optional<NoteMetadata> noteMetadata = noteMetadataService.get(2);
        noteMetadata.ifPresent(noteMetadata1 -> assertEquals(2, noteMetadata1.getId()));
    }

    @Test
    public void getAllNoteMetadata() {
        SearchCriteria criteria = new SearchCriteria("patient.name", "=", "Patient 1");
        List<NoteMetadata> noteMetadataList = noteMetadataService.search(criteria);
        assertNotNull(noteMetadataList);
    }
}