package com.genspark.SpringBootOne.DAO;

import com.genspark.SpringBootOne.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {

}
