package example.controllers;

import example.entities.Author;
import example.entities.Book;
import example.services.AuthorService;
import example.services.BookService;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/moreinfo")
public class MoreInfoServlet extends HttpServlet {
    @EJB
    private AuthorService authorService;
    @EJB
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Book book = bookService.getById(Integer.valueOf(id));
        Author author = book.getAuthor();
        req.setAttribute("book", book);
        req.setAttribute("author", author);
        RequestDispatcher dispatcher = req.getRequestDispatcher("moreinfo.jsp");
        dispatcher.forward(req, resp);

    }
}