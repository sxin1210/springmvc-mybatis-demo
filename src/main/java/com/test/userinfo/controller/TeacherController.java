package com.test.userinfo.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.test.userinfo.entity.Response;
import com.test.userinfo.entity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.sql.Date;
import java.util.Calendar;

import com.test.userinfo.entity.Book;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

/**
 * Created by songxin07 on 17/6/23.
 */
@Controller
public class TeacherController {

    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    public void addTeacher(@RequestBody Teacher teacher){
        System.out.println("!!!Test param Teacher "+teacher);
    }

    @RequestMapping(value = "/showTeacher", method = RequestMethod.GET)
    @ResponseBody
    public Response showTeacher(){
        System.out.println("!!!Test show response ");
        Response res = new Response();
        res.setCode(111);
        res.setMsg("testing Response");
        Teacher teacher = new Teacher();
        teacher.setClassId(666);
        teacher.setSubject("computer");
        String Nowtime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        java.sql.Date date=java.sql.Date.valueOf(Nowtime);
        Book book = new Book(233,"springmvc in action","CCC","sdcadc",date,889.9);
        teacher.setBook(book);
        System.out.println("!!!creat a teacher "+ teacher);
        res.setData(teacher);
        System.out.println("!!!creat a Response "+ res);
        return  res;
    }

    @RequestMapping(value = "/addSomeTeacher",method = RequestMethod.POST)
    public void addSomeTeacher(@RequestBody List<Teacher> teachers){
        System.out.println("!!!list size:" + teachers.size());
        Iterator<Teacher> it = teachers.iterator();
        while(it.hasNext()){
            Teacher teacher = it.next();
            System.out.println("!!!add new teacher:" + teacher);
        }
    }

}
