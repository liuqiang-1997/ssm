package com.liuqiang.service;

import com.liuqiang.dao.BookMapper;
import com.liuqiang.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    // service层调用dao层,组合dao
    @Autowired
    private BookMapper bookMapper;

    // set方法方便Spring托管注入
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBookById(Books books) {
        System.out.println("BookServiceImpl: updateBookById =>"+books);
        return bookMapper.updateBookById(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public Books queryBookName(String bookName) {
        return bookMapper.queryBookName(bookName);
    }


}
