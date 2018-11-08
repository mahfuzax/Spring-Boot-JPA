package info.mahfuz.jpa.service;

import info.mahfuz.jpa.model.SearchCriteria;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, K> {
    void add(T entity);
    void update(T entity);
    Optional<T> get(K by);
    void delete(K by);
    List<T> search(SearchCriteria criteria);
}
