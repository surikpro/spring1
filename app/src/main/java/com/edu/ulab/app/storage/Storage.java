package com.edu.ulab.app.storage;

import com.edu.ulab.app.entity.Book;
import com.edu.ulab.app.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private List<User> usersStorage;
    private List<Book> booksStorage;

    public Storage() {
        this.usersStorage = new ArrayList<>();
        this.booksStorage = new ArrayList<>();
    }

    public List<User> getUsersStorage() {
        return usersStorage;
    }

    public List<Book> getBooksStorage() {
        return booksStorage;
    }

    //todo создать хранилище в котором будут содержаться данные
    // сделать абстракции через которые можно будет производить операции с хранилищем
    // продумать логику поиска и сохранения
    // продумать возможные ошибки
    // учесть, что при сохранеии юзера или книги, должен генерироваться идентификатор
    // продумать что у узера может быть много книг и нужно создать эту связь
    // так же учесть, что методы хранилища принимают друго тип данных - учесть это в абстракции
}
