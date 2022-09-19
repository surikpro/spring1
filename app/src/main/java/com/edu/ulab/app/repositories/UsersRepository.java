package com.edu.ulab.app.repositories;

import com.edu.ulab.app.dto.UserDto;
import com.edu.ulab.app.entity.User;

public interface UsersRepository {
    User createUser(UserDto userDto);
}
