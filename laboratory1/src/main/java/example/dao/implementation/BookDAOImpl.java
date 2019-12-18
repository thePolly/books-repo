package example.dao.implementation;

import example.dao.interfaces.BookDAO;
import example.entities.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Stateless(name = "BookDAOImpl")
public class BookDAOImpl implements BookDAO {

    EntityManager entityManager = Persistence.createEntityManagerFactory("booksManager").createEntityManager();


    public void create(Book book) {
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
    }

    public void delete(long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(getById(id));
        entityManager.getTransaction().commit();
    }

    public void update(Book book) {
        entityManager.getTransaction().begin();
        entityManager.merge(book);
        entityManager.getTransaction().commit();
    }

    public Book getById(long id) {
        return entityManager.find(Book.class, id);
    }

    public List<Book> getAll() {
        Query query = entityManager.createQuery("SELECT b FROM Book b");
        return query.getResultList();
    }
}
