package info.mahfuz.jpa.service;

import info.mahfuz.jpa.model.NoteMetadata;

import java.util.Optional;

public interface NoteMetadataService {
    void add(NoteMetadata metadata);
    Optional<NoteMetadata> getBy(int id);
    void delete(int id);
    void update(NoteMetadata metadata);
}
