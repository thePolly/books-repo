package example.controllers;

import example.entities.Author;
import example.entities.Book;
import example.services.AuthorService;
import example.services.BookService;

import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/books")
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class BooksServlet extends HttpServlet {

    @EJB
   private BookService service;


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = service.getAll();
        req.setAttribute("bookslist", books);
        RequestDispatcher dispatcher = req.getRequestDispatcher("books.jsp");
        dispatcher.forward(req, resp);
    }



}
