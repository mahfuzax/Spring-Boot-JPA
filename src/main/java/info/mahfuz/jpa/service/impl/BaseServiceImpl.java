package info.mahfuz.jpa.service.impl;

import info.mahfuz.jpa.model.SearchCriteria;
import info.mahfuz.jpa.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T, K, R extends CrudRepository> implements BaseService<T, K> {
    @Autowired protected R repository;

    @Override
    public void add(T entity) {
        repository.save(entity);
    }

    @Override
    public void update(T entity) {
        repository.save(entity);
    }

    @Override
    public Optional<T> get(K by) {
        return repository.findById(by);
    }

    @Override
    public void delete(K by) {
        repository.deleteById(by); // TODO use type to detect what to do
    }

    @Override
    public List<T> search(SearchCriteria criteria) {
        return null;
    }
}
