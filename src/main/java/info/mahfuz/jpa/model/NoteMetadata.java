package info.mahfuz.jpa.model;

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

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "metadata", fetch = FetchType.LAZY)
    private Patient patient;

}
