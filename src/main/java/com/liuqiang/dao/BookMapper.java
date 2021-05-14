package com.liuqiang.dao;

import com.liuqiang.pojo.Books;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface BookMapper {

    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookById(@Param("id") int id);

    // 修改一本书
    int updateBookById(Books books);

    // 查询书
    Books queryBookById(@Param("id") int id);

    List<Books> queryAllBooks();

    Books queryBookName(@Param("bookName") String bookName);
}
