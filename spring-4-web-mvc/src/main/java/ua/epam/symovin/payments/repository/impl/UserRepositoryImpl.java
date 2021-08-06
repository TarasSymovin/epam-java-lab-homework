package ua.epam.symovin.payments.repository.impl;

import org.springframework.stereotype.Component;
import ua.epam.symovin.payments.model.User;
import ua.epam.symovin.payments.repository.UserRepository;

import java.util.List;

@Component
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User getUser(int id) {
        return User.builder().userId(5).build();
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User createUser(User user) {
        return user;
    }

    @Override
    public User updateUser(int id, User user) {
        return user;
    }

    @Override
    public void deleteUser(int id) {

    }
}
