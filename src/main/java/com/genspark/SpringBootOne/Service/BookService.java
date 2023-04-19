package com.genspark.SpringBootOne.Service;

import com.genspark.SpringBootOne.Entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    Book getBookById(int bookID);
    Book addBook(Book book);
    Book updateBook(Book book);
    Book deleteBook(int bookId);

}
