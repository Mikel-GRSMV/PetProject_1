package ru.folder.fakeDB;

import ru.folder.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage(){
        this.users = new ArrayList<>();
        this.users = new ArrayList<>();
        User user1 = new User("Mike", "89153292734" , LocalDate.parse("2000-02-19"));
        User user2 = new User("John", "89153292735" , LocalDate.parse("1899-03-21"));
        User user3 = new User("Dan", "8985053542" , LocalDate.parse("1992-05-30"));
        User user4 = new User("Kevin", "8985054332" , LocalDate.parse("1950-07-10"));
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    public static FakeStorage storage(){
        return storage;
    }

    public List<User> users() {
        return users;
    }
}
