package ua.epam.symovin.payments.repository;

import ua.epam.symovin.payments.model.User;

import java.util.List;

public interface UserRepository {
    User getUser(int id);

    List<User> getUsers();

    User createUser(User user);

    User updateUser(int id, User user);

    void deleteUser(int id);
}
