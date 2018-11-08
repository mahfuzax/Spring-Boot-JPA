package info.mahfuz.jpa.controller;

import info.mahfuz.jpa.model.Patient;
import info.mahfuz.jpa.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/patient")
public class PatientController {
    @Autowired private PatientService service;

    @GetMapping("/get/{id}")
    public @ResponseBody
    Optional<Patient> getById(@PathVariable int id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public @ResponseBody void add(@RequestBody Patient patient) {
        service.add(patient);
    }

    /*@GetMapping("/search/{scribeId}")
    public @ResponseBody
    List<Patient> search(@PathVariable int scribeId) {
        SearchCriteria criteria = new SearchCriteria("scribeId", "=", scribeId);
        return service.search(criteria);
    }*/

}