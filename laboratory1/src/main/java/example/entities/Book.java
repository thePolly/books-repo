package example.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "books")
public class Book  implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "book_id")
    private long bookId;

    private String name;

    @ManyToMany
    @JoinColumn(name = "author")
    private List<Author> author;
    private long year;
    private String genre;
    private String subject;
    @Column(name = "abstract")
    private String booksAbstract;

}

