package example.dao.implementation;

import example.dao.interfaces.AuthorDAO;
import example.entities.Author;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class AuthorDAOImpl implements AuthorDAO {

    @PersistenceContext(name = "myUnit")
    EntityManager entityManager;

    public void create(Author author) {
        entityManager.getTransaction().begin();
        entityManager.persist(author);
        entityManager.getTransaction().commit();
    }

    public void delete(Integer id) {
        entityManager.getTransaction().begin();
        entityManager.remove(getById(id));
        entityManager.getTransaction().commit();
    }

    public void update(Author author) {
        entityManager.getTransaction().begin();
        entityManager.merge(author);
        entityManager.getTransaction().commit();
    }

    public Author getById(Integer id) {
        return entityManager.find(Author.class, id);
    }

    public List<Author> getAll() {
        Query query = entityManager.createQuery("SELECT a FROM Author a");
        return query.getResultList();
    }
}
