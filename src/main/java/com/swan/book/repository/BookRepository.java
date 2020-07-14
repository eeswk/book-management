package com.swan.book.repository;

import com.swan.book.domain.Books;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {

    @Query("SELECT p FROM Books p ORDER BY p.id DESC")
    List<Books> findAllDesc();
}
