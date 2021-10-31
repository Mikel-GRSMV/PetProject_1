package ru.folder.repositories;

import ru.folder.models.User;

import java.util.List;

public interface UserRepositoryInterface {
    List<User> findUser();
    void save(User user);
    boolean isExist(String name, String password);
}
