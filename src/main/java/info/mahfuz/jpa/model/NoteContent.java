package info.mahfuz.jpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class NoteContent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "patientId", referencedColumnName = "id")
    private Patient patient;
}
