package info.mahfuz.jpa.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name = "patientId", referencedColumnName = "id")
    private Patient patient;
}
