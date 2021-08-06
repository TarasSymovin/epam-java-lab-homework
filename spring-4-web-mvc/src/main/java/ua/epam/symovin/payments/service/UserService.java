package ua.epam.symovin.payments.service;

import ua.epam.symovin.payments.dto.UserDto;
import ua.epam.symovin.payments.model.User;

import java.util.List;

public interface UserService {
    UserDto getUser(int id);

    List<UserDto> getUsers();

    UserDto createUser(UserDto user);

    UserDto updateUser(int id, UserDto user);

    void deleteUser(int id);
}
