package example.entities;


import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@Entity
@Table(name = "authors")
public class Author implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "author_id")
    private Integer authorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "year_of_birth")
    private Integer yearOfBirth;


    protected boolean canEqual(final Object other) {
        return other instanceof Author;
    }

}