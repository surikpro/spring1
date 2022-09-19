package com.edu.ulab.app.repositories.Impl;

import com.edu.ulab.app.dto.BookDto;
import com.edu.ulab.app.entity.Book;
import com.edu.ulab.app.mapper.BookMapper;
import com.edu.ulab.app.repositories.BooksRepository;
import com.edu.ulab.app.storage.Storage;
import org.springframework.stereotype.Service;

@Service
public class BooksRepositoryImpl implements BooksRepository {
    private int counter = 0;

    private final Storage storage = new Storage();

    private final BookMapper bookMapper;

    public BooksRepositoryImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Book createBook(BookDto bookDto) {
        Book book = bookMapper.bookDtoToBook(bookDto);
        book.setId((long) counter);
        storage.getBooksStorage().add(counter, book);
        counter++;
        return book;
    }
}
