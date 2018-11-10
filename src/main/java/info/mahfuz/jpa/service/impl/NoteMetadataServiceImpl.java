package info.mahfuz.jpa.service.impl;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.SearchCriteria;
import info.mahfuz.jpa.specification.NoteMetadataSpecification;
import info.mahfuz.jpa.repo.NoteMetadataRepository;
import info.mahfuz.jpa.service.NoteMetadataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteMetadataServiceImpl extends BaseServiceImpl<NoteMetadata, Integer, NoteMetadataRepository> implements NoteMetadataService {
    @Override
    public List<NoteMetadata> search(SearchCriteria criteria) {
        NoteMetadataSpecification specification = new NoteMetadataSpecification(criteria);
        return repository.findAll(specification);
    }
}
