package com.example.shop_store_back.api;

import com.example.shop_store_back.data.Author;
import com.example.shop_store_back.data.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

    @QueryMapping
    public Optional<Book> bookById(@Argument String id) {
        return Book.getById(id);
    }

    @QueryMapping
    public List<Book> books() {
        return Book.books;
    }

    @SchemaMapping
    public  Optional<Author> author(Book book) {
        return Author.getById(book.authorId());
    }
}