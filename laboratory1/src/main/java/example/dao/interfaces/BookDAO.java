package example.dao.interfaces;

import example.entities.Book;

import java.util.List;

public interface BookDAO {
    void create(Book book);

    void delete(Integer id);

    void update(Book book);

    Book getById(Integer id);

    List<Book> getAll();
}
