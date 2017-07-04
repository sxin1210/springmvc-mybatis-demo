package com.test.userinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import com.test.userinfo.entity.Book;
import com.test.userinfo.service.BookService;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;

/**
 * Created by songxin07 on 17/6/20.
 */
@Controller
public class BookController {
    /**
     * 自动注入BookService
     * */
//    @Autowired
//    @Qualifier("bookService")
//   Autowired按照类型注入，两者效果等同
    @Resource
    private BookService bookService;

    /**
     * 处理/main请求
     * */
    @RequestMapping(value="/main")
    public String main(Model model){
        // 获得所有图书集合
        List<Book> book_list = bookService.getAll();
        // 将图书集合添加到model当中
        model.addAttribute("book_list", book_list);
        // 跳转到main页面
        return "main";
    }

    @RequestMapping(value = "/addOneBook", method = RequestMethod.POST)
    public void addOnebook(@RequestBody Book book){
//        传book的具体参数放到serviceimpl中做，这里看起来简单点
//        bookService.addOneBook(book.getName(),book.getAuthor(),book.getPublicationdate(),book.getPublication(),book.getPrice());
        bookService.addOneBook(book);
    }

    @RequestMapping(value = "/selectOneBookByBookName", method = RequestMethod.POST)
    @ResponseBody
    public Book selectOneBookByBookName(@RequestParam("name")String boonName){
//        Book book = new Book();
//        book.setId(12);
//        book.setName("testResBody");
//        book.setAuthor("xxx");
//        book.setPrice(123.0);
//        String Nowtime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
//        java.sql.Date date=java.sql.Date.valueOf(Nowtime);
//        book.setPublicationdate(date);
//        book.setPublication("XXXXXAAD");
        Book book = bookService.selectOneBookByBookName(boonName);
        return book;
    }

    @RequestMapping(value = "/getAllBook",method = RequestMethod.GET)
    @ResponseBody
    public List<Book> getAllBook(){
        List<Book> book_list = bookService.getAll();
        for(Book b: book_list){
            System.out.println("!!!find book:"+b);
        }
        return book_list;
    }

    @RequestMapping(value = "/modifyBook",method = RequestMethod.POST)
    public void modifyBook(@RequestBody Book book){
        bookService.modifyBook(book);
    }

    @RequestMapping(value = "/deleteBook",method = RequestMethod.POST)
    public void deleteBook(@RequestParam("id") int id){
        bookService.deleteBook(id);
    }

}
