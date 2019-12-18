package example.services;

import example.dao.implementation.BookDAOImpl;
import example.entities.Book;

import javax.ejb.EJB;
import java.util.List;

public class BookService {

    @EJB(beanName = "BookDAO")
    private BookDAOImpl bookDAO;

    public void create(Book book) {
        bookDAO.create(book);
    }

    public void delete(long id) {
        bookDAO.delete(id);
    }

    public void update(Book book) {
        bookDAO.update(book);
    }

    public Book getById(long id) {
        return bookDAO.getById(id);
    }

    public List<Book> getAll() {
        return bookDAO.getAll();
    }
}
