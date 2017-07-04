package com.test.userinfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * Created by songxin07 on 17/6/23.
 */
public class Teacher implements Serializable{
    @JsonIgnore
    private static final long serialVersionUID = -3506965972386842007L;

    private int classId;
    private String subject;
    private Book book;

    public Teacher(){
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    @Override
    public String toString(){
        return "Teacher [ classID=" + classId + ", subject="+subject+", Book="+book+"]";
    }
}
