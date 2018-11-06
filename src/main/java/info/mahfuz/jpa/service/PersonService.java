package info.mahfuz.jpa.service;

import info.mahfuz.jpa.model.Person;

import java.util.Optional;

public interface PersonService {
    Optional<Person> getById(int id);
    void add(Person person);
    void update(Person person);
    void delete(int id);
    Iterable<Person> getAll();
}
