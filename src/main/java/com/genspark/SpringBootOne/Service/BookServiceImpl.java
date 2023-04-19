package com.genspark.SpringBootOne.Service;

import com.genspark.SpringBootOne.DAO.BookDAO;
import com.genspark.SpringBootOne.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> getAllBooks() {
        return this.bookDAO.findAll();

}
