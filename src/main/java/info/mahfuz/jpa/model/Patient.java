package info.mahfuz.jpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name = "noteId", referencedColumnName = "id")
    private NoteMetadata metadata;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<NoteContent> contents;
}
