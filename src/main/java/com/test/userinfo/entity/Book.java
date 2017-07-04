package com.test.userinfo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by songxin07 on 17/6/20.
 */
public class Book implements Serializable{
    @JsonIgnore
    private static final long serialVersionUID = 3614078051403286373L;
    private Integer id;				// id
    private String name;			// 书名
    private String author;			// 作者
    private String publication;		// 出版社
    private Date publicationdate;	// 出版日期
    private Double price;			// 价格

    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Book(int id,String name,String author,String publication,Date date,Double price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.publicationdate = date;
        this.price = price;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public Date getPublicationdate() {
        return publicationdate;
    }
    public void setPublicationdate(Date publicationdate) {
        this.publicationdate = publicationdate;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author
                + ", publication=" + publication + ", publicationdate="
                + publicationdate + ", price=" + price + "]";
    }


}
