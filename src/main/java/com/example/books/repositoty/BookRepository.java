package com.example.books.repositoty;

import com.example.books.entity.bookentity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface BookRepository extends JpaRepository<bookentity, Integer> {

    List<bookentity> findByTitle(String title);

    List<bookentity> findByAuthor(String author);

    List<bookentity> findByPriceGreaterThan(double price);

}

