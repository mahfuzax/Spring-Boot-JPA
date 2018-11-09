package info.mahfuz.jpa.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CommentContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "noteContentId")
    private NoteContent noteContent;

    @OneToOne
    @JoinColumn(name = "commentId")
    private Comment comment;

    private String value;

}
