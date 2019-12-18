package example.dao.interfaces;

import example.entities.Book;

import java.util.List;

public interface BookDAO {
    void create(Book book);

    void delete(long id);

    void update(Book book);

    Book getById(long id);

    List<Book> getAll();
}
