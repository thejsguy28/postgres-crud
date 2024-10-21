package com.thejsguy.postgres_crud.repository;

import com.thejsguy.postgres_crud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
