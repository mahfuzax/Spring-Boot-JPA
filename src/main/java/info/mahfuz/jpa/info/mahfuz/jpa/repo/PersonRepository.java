package info.mahfuz.jpa.info.mahfuz.jpa.repo;

import info.mahfuz.jpa.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
