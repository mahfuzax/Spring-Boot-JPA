package info.mahfuz.jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class NoteMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int scribeId;

    private int providerId;

    private int partnerId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "metadata")
    private Patient patient;

}
