package info.mahfuz.jpa.controller;

import info.mahfuz.jpa.model.Person;
import info.mahfuz.jpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/person")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Optional<Person> getById(@PathVariable int id) {
        return personService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Person person) {
        personService.add(person);
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        personService.delete(id);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Person> getAll() {
        return personService.getAll();
    }
}
