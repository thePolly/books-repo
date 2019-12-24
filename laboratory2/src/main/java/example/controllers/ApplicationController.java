package example.controllers;

import example.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import example.services.BookService;


@Controller
public class ApplicationController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String watchIndex(Model model){
        return "index";
    }

}
