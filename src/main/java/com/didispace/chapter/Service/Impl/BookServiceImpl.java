package com.didispace.chapter.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.didispace.chapter.Mapper.BookMapper;
import com.didispace.chapter.Service.BookService;
import com.didispace.chapter.domain.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}
