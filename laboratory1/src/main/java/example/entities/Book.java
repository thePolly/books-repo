package example.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "books")
public class Book  implements java.io.Serializable{

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer bookId;
    private String name;
    private Integer year;
    private String summary;
    @OneToOne
    private Author author;
}

