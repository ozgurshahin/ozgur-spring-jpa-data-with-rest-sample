package com.example.ozgurspringjpadatawithrestsample.repo;

import com.example.ozgurspringjpadatawithrestsample.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    Optional<Book> findByName(@Param("name") String name);
}
