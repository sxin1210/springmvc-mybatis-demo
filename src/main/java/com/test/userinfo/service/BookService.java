package com.test.userinfo.service;
import com.test.userinfo.entity.Book;
import java.util.List;
import java.util.Date;

/**
 * Created by songxin07 on 17/6/20.
 */
public interface BookService {
    List<Book> getAll();
//    int addOneBook(String  name, String author, Date publicationdate, String publication, double price);
    int addOneBook(Book book);
    Book selectOneBookByBookName(String bookName);
    void modifyBook(Book book);
    void deleteBook(int id);
}
