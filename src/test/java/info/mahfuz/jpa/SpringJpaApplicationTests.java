package info.mahfuz.jpa;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.service.NoteMetadataService;
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

    @Autowired
    NoteMetadataService noteMetadataService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void saveNoteMetadata() {
        NoteMetadata metadata = new NoteMetadata();
        metadata.setProviderId(1);
        metadata.setPartnerId(1);
        metadata.setScribeId(1);

        noteMetadataService.add(metadata);
    }

    @Test
    public void getNoteMetadata() {
        Optional<NoteMetadata> noteMetadata = noteMetadataService.get(2);

        assertEquals(2, noteMetadata.get().getId());
    }

}
