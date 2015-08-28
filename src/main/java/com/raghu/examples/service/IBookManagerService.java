package com.raghu.examples.service;

import java.util.List;

import com.raghu.examples.vo.Book;


public interface IBookManagerService {
    
    public abstract Book find(Book search);
    public abstract Book findMore(Book search);

}
