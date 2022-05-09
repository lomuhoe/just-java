package moe.chei.book.service;

import java.util.ArrayList;
import java.util.List;

import moe.chei.book.vo.Book;

public class BookServiceimpl implements BookService{
    List<Book> bookList = new ArrayList<>();

    @Override
    public int delete(Book book) {
        bookList.remove(book);
        return 1;
    }

    @Override
    public int insert(Book book) {
        bookList.add(book);
        return 1;
    }

    @Override
    public List<Book> selectAll() {
        return bookList;
    }

    @Override
    public Book selectOne(String id) {
        for(Book book : bookList){
            if(book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }

    @Override
    public int update(Book book) {
        Book tempBook = selectOne(book.getId());
        if(tempBook==null){
            System.out.println("BookService.update() 에러!");
        }
        int index = bookList.indexOf(tempBook);
        bookList.remove(index);
        bookList.add(index, book);
        return 1;
    }
    
}
