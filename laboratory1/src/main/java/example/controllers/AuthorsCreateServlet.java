package example.controllers;

import example.entities.Author;
import example.services.AuthorService;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/createAuthor")
public class AuthorsCreateServlet extends HttpServlet {

    @EJB
    AuthorService authorService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        Integer yearOfBirth = Integer.valueOf(req.getParameter("yearOfBirth"));
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setYearOfBirth(yearOfBirth);

       Author result =  authorService.create(author);
        boolean saveStatus = author.getAuthorId().equals(result.getAuthorId());
        if(saveStatus){
            resp.sendRedirect(req.getContextPath() + "/authors");
            return;
        }
        else{
            resp.sendRedirect(req.getContextPath() + "/index");
            return;
        }
    }
}
