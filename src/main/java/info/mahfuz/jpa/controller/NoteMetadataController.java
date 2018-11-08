package info.mahfuz.jpa.controller;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.SearchCriteria;
import info.mahfuz.jpa.predicate.NoteMetadataSpecification;
import info.mahfuz.jpa.repo.NoteMetadataRepository;
import info.mahfuz.jpa.service.NoteMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/note")
public class NoteMetadataController {
    @Autowired private NoteMetadataService service;
    @Autowired private NoteMetadataRepository repository;

    @GetMapping("/get/{id}")
    public @ResponseBody
    Optional<NoteMetadata> getById(@PathVariable int id) {
        return service.getBy(id);
    }

    @PostMapping("/add")
    public @ResponseBody void add(@RequestBody NoteMetadata metadata) {
        service.add(metadata);
    }

    @GetMapping("/search")
    public @ResponseBody List<NoteMetadata> search() {
        SearchCriteria criteria = new SearchCriteria("scribeId", "=", "4");
        NoteMetadataSpecification specification = new NoteMetadataSpecification(criteria);
        List<NoteMetadata> noteMetadataList = repository.findAll(specification);
        return noteMetadataList;
    }

}
