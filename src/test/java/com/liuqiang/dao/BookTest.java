package com.liuqiang.dao;

import com.liuqiang.pojo.Books;
import com.liuqiang.service.BookService;
import com.liuqiang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.awt.print.Book;
import java.util.List;

public class BookTest {

    @Test
    public void queryAllBooks(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
//        mapper.queryAllBooks();
//        sqlSession.close();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        List<Books> books = bookServiceImpl.queryAllBooks();
        for (Books book:books
             ) {
            System.out.println(book);
        }
    }
}
