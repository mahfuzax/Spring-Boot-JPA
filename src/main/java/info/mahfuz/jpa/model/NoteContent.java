package info.mahfuz.jpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class NoteContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;
}
