import example.dao.implementation.AuthorDAOImpl;
import example.dao.interfaces.AuthorDAO;
import example.dao.interfaces.BookDAO;
import example.entities.Author;
import example.entities.Book;
import example.services.AuthorService;

import java.util.ArrayList;
import java.util.List;

public  class Main{
public static  void main(String[] args)
{
    AuthorService authorService = new AuthorService();
    Author author = new Author();
    author.setFirstName("Stephen");
    author.setLastName("King");
    Author author2 = new Author();
    author2.setFirstName("Stephen2");
    author2.setLastName("King2");
    author.setAuthorId(1);
    authorService.getAll();
    AuthorDAO authorDAO = new AuthorDAOImpl();
    //authorDAO.getAll();

    System.out.println(author2.toString());

    //authorService.getAll();
}
}
