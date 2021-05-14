package com.liuqiang.service;

import com.liuqiang.pojo.Books;
import org.apache.ibatis.annotations.Param;


import java.awt.print.Book;
import java.util.List;

public interface BookService {

    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookById( int id);

    // 修改一本书
    int updateBookById(Books books);

    // 查询书
    Books queryBookById(int id);

    List<Books> queryAllBooks();

    Books queryBookName(@Param("bookName") String bookName);
}
