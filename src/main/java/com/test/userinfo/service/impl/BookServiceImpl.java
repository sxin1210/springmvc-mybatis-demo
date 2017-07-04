package com.test.userinfo.service.impl;

import com.test.userinfo.entity.Book;
import com.test.userinfo.mapper.BookMapper;
import com.test.userinfo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by songxin07 on 17/6/20.
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> getAll() {
        return bookMapper.findAll();
    }

//    public int addOneBook(String name, String author, Date publicationdate, String publication, double price) {
//        return bookMapper.addOneBook(name, author, publicationdate, publication, price);
//    }

//  这里再来传递参数
    public int addOneBook(Book book){
        return bookMapper.addOneBook(book.getName(),book.getAuthor(),book.getPublicationdate(),book.getPublication(),book.getPrice());
    }

    public Book selectOneBookByBookName(String bookName){
        return bookMapper.selectOneBookByBookName(bookName);
    }

    public void modifyBook(Book book){
        bookMapper.modifyBook(book);
    }

    public void deleteBook(int id){
        bookMapper.deleteBookByID(id);
    }
}
