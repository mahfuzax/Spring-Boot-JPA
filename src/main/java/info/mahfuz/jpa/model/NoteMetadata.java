package info.mahfuz.jpa.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class NoteMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int scribeId;

    private int providerId;

    private int partnerId;

    @OneToOne(mappedBy = "metadata", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Patient patient;

}
