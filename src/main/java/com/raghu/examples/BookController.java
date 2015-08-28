package com.raghu.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raghu.examples.service.IBookManagerService;
import com.raghu.examples.vo.Book;
import com.raghu.examples.vo.Employee;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);
    @Autowired
    IBookManagerService ibookmanager;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "BookSearch/findByParam", method = RequestMethod.POST)
    public String find(@ModelAttribute("searchForm") Book book, Model m) {
        System.out.println("Searched Book is : " + book);
        Book books = ibookmanager.find(book);
        System.out.println("books :=" + books);
        m.addAttribute("books", books);
        return "result";
    }

   
    @RequestMapping(value="more", method = RequestMethod.POST, consumes="application/json", produces="application/json")
    @ResponseBody
    public Book moreResults(@RequestBody Book search) {
       System.out.println("Getting more similar books for := "+search);
       Book result = ibookmanager.findMore(search);
       System.out.println("search result is :="+ result);
       return result;
    }

}
