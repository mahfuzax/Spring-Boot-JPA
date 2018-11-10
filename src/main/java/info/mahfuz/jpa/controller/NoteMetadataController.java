package info.mahfuz.jpa.controller;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.SearchCriteria;
import info.mahfuz.jpa.service.NoteMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/note")
public class NoteMetadataController {
    private final NoteMetadataService service;

    @Autowired
    public NoteMetadataController(NoteMetadataService service) {
        this.service = service;
    }

    @GetMapping("/get/{id}")
    public @ResponseBody
    Optional<NoteMetadata> getById(@PathVariable int id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public @ResponseBody void add(@RequestBody NoteMetadata metadata) {
        service.add(metadata);
    }

    @GetMapping("/search/{scribeId}")
    public @ResponseBody List<NoteMetadata> search(@PathVariable int scribeId) {
        SearchCriteria criteria = new SearchCriteria("scribeId", "=", scribeId);
        return service.search(criteria);
    }

}
