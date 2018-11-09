package info.mahfuz.jpa.predicate;

import info.mahfuz.jpa.model.NoteMetadata;
import info.mahfuz.jpa.model.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class NoteMetadataSpecification implements Specification<NoteMetadata> {
    private SearchCriteria criteria;

    public NoteMetadataSpecification(SearchCriteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public Specification<NoteMetadata> and(Specification<NoteMetadata> other) {
        return null;
    }

    @Override
    public Specification<NoteMetadata> or(Specification<NoteMetadata> other) {
        return null;
    }

    @Override
    public Predicate toPredicate(Root<NoteMetadata> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        if (criteria.getOperation().equalsIgnoreCase(">")) {
            return criteriaBuilder.greaterThan(root.get(criteria.getKey()), criteria.getValue().toString());
        } else if(criteria.getOperation().equalsIgnoreCase("=")) {
            return criteriaBuilder.equal(root.<String>get(criteria.getKey()), criteria.getValue().toString());
        }

        return null;
    }
}
