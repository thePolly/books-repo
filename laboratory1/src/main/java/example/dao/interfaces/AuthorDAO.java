package example.dao.interfaces;

import example.entities.Author;

import java.util.List;

public interface AuthorDAO {
    void create(Author author);

    void delete(long id);

    void update(Author author);

    Author getById(long id);

    List<Author> getAll();
}
