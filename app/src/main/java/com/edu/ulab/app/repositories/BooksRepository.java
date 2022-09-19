package com.edu.ulab.app.repositories;

import com.edu.ulab.app.dto.BookDto;
import com.edu.ulab.app.entity.Book;

public interface BooksRepository {
    Book createBook(BookDto bookDto);
}
