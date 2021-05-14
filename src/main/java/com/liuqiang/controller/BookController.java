package com.liuqiang.controller;

import com.liuqiang.pojo.Books;
import com.liuqiang.service.BookService;
import com.liuqiang.service.BookServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

//    controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService ;

//    查询所有书籍并且返回一个书籍展示页面
    @RequestMapping("/allbook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("list",books);
        return "allbook";
    }

//     跳转到增加书籍页面
    @RequestMapping("/toaddbook")
    public String toAddPage(){
        return "addbook";
    }

//    添加书籍
    @RequestMapping("/addbook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allbook"; // 重定向请求
    }

//     跳转到修改书籍页面
    @RequestMapping("/toupdatebook")
    public String toUpdatePage(int id ,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "update";
    }

//    修改书籍
    @RequestMapping("/updatebook")
    public String updateBook(Books books){
        bookService.updateBookById(books);
        return "redirect:/book/allbook";
    }

//    删除书籍(rest风格）
    @RequestMapping("/deletebook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allbook";
    }

//    查询书籍
    @RequestMapping("/querybook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookName(queryBookName);
        model.addAttribute("getbook",books);
        List<Books> list = new ArrayList();
        list.add(books);
        if(books == null){
            list = bookService.queryAllBooks();
            model.addAttribute("erro","query erro!!!");
        }
        model.addAttribute("list",list);
        return "allbook";

    }
}
