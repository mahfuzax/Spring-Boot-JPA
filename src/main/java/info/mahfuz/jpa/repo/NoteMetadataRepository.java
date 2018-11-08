package info.mahfuz.jpa.repo;

import info.mahfuz.jpa.model.NoteMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteMetadataRepository extends JpaRepository<NoteMetadata, Integer>, JpaSpecificationExecutor<NoteMetadata> {
}
