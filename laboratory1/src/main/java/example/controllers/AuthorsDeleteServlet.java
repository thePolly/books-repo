package example.controllers;

import example.services.AuthorService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/deleteAuthors")
public class AuthorsDeleteServlet extends HttpServlet {
    @EJB
    private AuthorService authorService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        authorService.delete(Integer.valueOf(id));
        resp.sendRedirect(req.getContextPath() + "/authors");
    }
}