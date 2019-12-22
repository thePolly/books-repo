package example.dao.implementation;

import example.dao.interfaces.AuthorDAO;
import example.entities.Author;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless(name = "AuthorDAOImpl")
public class AuthorDAOImpl implements AuthorDAO {

    @PersistenceContext(name = "authorsManager")
    EntityManager entityManager;

    public void create(Author author) {
        entityManager.getTransaction().begin();
        entityManager.persist(author);
        entityManager.getTransaction().commit();
    }

    public void delete(long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(getById(id));
        entityManager.getTransaction().commit();
    }

    public void update(Author author) {
        entityManager.getTransaction().begin();
        entityManager.merge(author);
        entityManager.getTransaction().commit();
    }

    public Author getById(long id) {
        return entityManager.find(Author.class, id);
    }

    public List<Author> getAll() {
        Query query = entityManager.createQuery("SELECT a FROM Author a");
        return query.getResultList();
    }
}
