package info.mahfuz.jpa.service.impl;

import info.mahfuz.jpa.info.mahfuz.jpa.repo.PersonRepository;
import info.mahfuz.jpa.model.Person;
import info.mahfuz.jpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<Person> getById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public void add(Person person) {
        personRepository.save(person);
    }

    @Override
    public void update(Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(int id) {
        personRepository.deleteById(id);
    }

    @Override
    public Iterable<Person> getAll() {
        return personRepository.findAll();
    }
}
