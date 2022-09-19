package com.edu.ulab.app.repositories.Impl;

import com.edu.ulab.app.dto.UserDto;
import com.edu.ulab.app.entity.User;
import com.edu.ulab.app.mapper.UserMapper;
import com.edu.ulab.app.repositories.UsersRepository;
import com.edu.ulab.app.storage.Storage;
import org.springframework.stereotype.Service;

@Service
public class UsersRepositoryImpl implements UsersRepository {

    private int counter = 0;

    private final Storage storage = new Storage();

    private final UserMapper userMapper;

    public UsersRepositoryImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User createUser(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        user.setId((long) counter);
        storage.getUsersStorage().add(counter, user);
        counter++;
        return user;
    }
}
