package example.controllers;

import example.entities.Author;
import example.services.AuthorService;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/authors")
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class AuthorsServlet extends HttpServlet  {

    @EJB
    private AuthorService service;


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   List<Author> groups = service.getAll();
        req.setAttribute("authors1", groups);
        RequestDispatcher dispatcher = req.getRequestDispatcher("authors.jsp");
        dispatcher.forward(req, resp);
    }





}

