package ru.gb.homework11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.homework11.model.Book;


public interface BookStoreRepository extends JpaRepository<Book, Long> {

}
