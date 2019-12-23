package example.dao.implementation;

import example.dao.interfaces.BookDAO;
import example.entities.Author;
import example.entities.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Stateless
public class BookDAOImpl implements BookDAO {

    @PersistenceContext(name = "myUnit")
    EntityManager entityManager;
    public void create(Book book) {
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
    }

    public void delete(Integer id) {
        entityManager.getTransaction().begin();
        entityManager.remove(getById(id));
        entityManager.getTransaction().commit();
    }

    public void update(Book book) {
        entityManager.getTransaction().begin();
        entityManager.merge(book);
        entityManager.getTransaction().commit();
    }

    public Book getById(Integer id) {
        return entityManager.find(Book.class, id);
    }

    public List<Book> getAll() {
        Query query = entityManager.createQuery("SELECT b FROM Book b");
        return query.getResultList();
    }
}
