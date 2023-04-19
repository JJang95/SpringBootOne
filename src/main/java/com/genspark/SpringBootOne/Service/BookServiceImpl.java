package com.genspark.SpringBootOne.Service;

import com.genspark.SpringBootOne.DAO.BookDAO;
import com.genspark.SpringBootOne.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> getAllBooks() {
        return this.bookDAO.findAll();

    }

    @Override
    public Book getBookById(int bookID) {
        Optional<Book> b = this.bookDAO.findById(bookID);
        Book book = null;

        if(b.isPresent()) {
            book = b.get();
        }
        else {
            throw new RuntimeException("Book not found for: " + bookID);
        }

        return book;
    }

    @Override
    public Book addBook(Book book) {
        return this.bookDAO.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookDAO.save(book);
    }

    @Override
    public String deleteBook(int bookId) {
        this.bookDAO.deleteById(bookId);
        return "Book deleted with ID: " + bookId;
    }

}
