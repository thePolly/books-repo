package example.dao.interfaces;

import example.entities.Author;

import java.util.List;

public interface AuthorDAO {
    void create(Author author);

    void delete(Integer id);

    void update(Author author);

    Author getById(Integer id);

    List<Author> getAll();
}
