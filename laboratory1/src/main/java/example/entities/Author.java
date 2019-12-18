package example.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "authors")
public class Author implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "author_id")
    private long authorId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private long yearOfBirth;
    @Column
    @ManyToMany
    @JoinColumn(name = "books")
    private List<Book> books;

}