package moe.chei.book.service;

import java.util.List;

import moe.chei.book.vo.Book;

public interface BookService {
    public int insert(Book book);
    public List<Book> selectAll();
    public Book selectOne(String id);
    public int delete(Book book);
    public int update(Book book);
}
