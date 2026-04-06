package com.example.books.controller;

import com.example.books.entity.bookentity;
import com.example.books.repositoty.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class bookcontroller {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/title/{title}")
    public List<bookentity> getBooksByTitle(@PathVariable String title) {

        return bookRepository.findByTitle(title);
    }


    @GetMapping("/author/{author}")
    public List<bookentity> getBooksByAuthor(@PathVariable String author) {
        return bookRepository.findByAuthor(author);
    }
}

