package ru.folder.repositories;

import ru.folder.fakeDB.FakeStorage;
import ru.folder.models.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepositoryInterface {
    @Override
    public List<User> findUser() {
        return FakeStorage.storage().users();
    }

    @Override
    public void save(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String name, String password) {
        for (User user : FakeStorage.storage().users()) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

