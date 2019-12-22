package example.services;

import example.dao.implementation.AuthorDAOImpl;
import example.dao.interfaces.AuthorDAO;
import example.entities.Author;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class AuthorService {

    @EJB
    private AuthorDAO authorDAO;

    public void create(Author author) {
        authorDAO.create(author);
    }

    public void delete(long id) {
        authorDAO.delete(id);
    }

    public void update(Author author) {
        authorDAO.update(author);
    }

    public Author getById(long id) {
        return authorDAO.getById(id);
    }

    public List<Author> getAll() {
        return authorDAO.getAll();
    }
}
