package com.example.books.service;

import com.example.books.entity.bookentity;
import com.example.books.repositoty.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class bookservice {

    @Autowired
    private BookRepository bookRepository;



    public List<bookentity> getByTitle(String title){

        return bookRepository.findByTitle(title);
    }

    public List<bookentity> getByAuthor(String author){

        return bookRepository.findByAuthor(author);
    }

    public List<bookentity> getPriceGreater(double price){
        return bookRepository.findByPriceGreaterThan(price);
    }
}

