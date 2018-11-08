package info.mahfuz.jpa.service.impl;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.SearchCriteria;
import info.mahfuz.jpa.predicate.NoteMetadataSpecification;
import info.mahfuz.jpa.repo.NoteMetadataRepository;
import info.mahfuz.jpa.service.NoteMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteMetadataServiceImpl implements NoteMetadataService {
    @Autowired
    NoteMetadataRepository repository;

    @Override
    public void add(NoteMetadata metadata) {
        repository.save(metadata);
    }

    @Override
    public Optional<NoteMetadata> getBy(int id) {
        return repository.findById(id);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(NoteMetadata metadata) {
        repository.save(metadata);
    }

    @Override
    public List<NoteMetadata> search(SearchCriteria searchCriteria) {
        NoteMetadataSpecification specification = new NoteMetadataSpecification(searchCriteria);
        return repository.findAll(specification);
    }
}
