package example.services;

import example.dao.interfaces.BookDAO;
import example.entities.Author;
import example.entities.Book;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class BookService {
    @EJB
    private BookDAO bookDAO;

    public Book create(Book book) {
        bookDAO.create(book);
        return book;
    }

    public void delete(Integer id) {
        bookDAO.delete(id);
    }

    public void update(Book book) {
        bookDAO.update(book);
    }

    public Book getById(Integer id) {
        return bookDAO.getById(id);
    }

    public List<Book> getAll() {
        return bookDAO.getAll();
    }
}
