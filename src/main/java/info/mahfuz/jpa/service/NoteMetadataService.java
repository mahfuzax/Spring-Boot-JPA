package info.mahfuz.jpa.service;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.SearchCriteria;

import java.util.List;
import java.util.Optional;

public interface NoteMetadataService {
    void add(NoteMetadata metadata);
    Optional<NoteMetadata> getBy(int id);
    void delete(int id);
    void update(NoteMetadata metadata);
    List<NoteMetadata> search(SearchCriteria searchCriteria);
}
