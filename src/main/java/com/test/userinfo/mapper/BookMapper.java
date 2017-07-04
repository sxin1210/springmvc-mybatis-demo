package com.test.userinfo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.test.userinfo.entity.Book;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.Date;
//import java.sql.Date;
import java.util.List;
/**
 * Created by songxin07 on 17/6/20.
 */
@Repository
public interface BookMapper {
    @Select(" select * from tb_book ")
    List<Book> findAll();

    @Insert("insert into tb_book(name,author,publicationdate,publication,price) values(#{name},#{author},#{publicationdate},#{publication},#{price})")
    int addOneBook(@Param("name") String  name,
                   @Param("author")String author,
                   @Param("publicationdate")Date publicationdate,
                   @Param("publication")String publication,
                   @Param("price")double price);
    @Select("select * from tb_book where name=#{bookname}")
    Book selectOneBookByBookName(@Param("bookname") String bookName);

    @Update("update tb_book set name=#{name} where id=#{id}")
    void modifyBook(Book book);

//    sql语句定义在mybatis/BookMapper.xml中
    void deleteBookByID(int id);
}
