package ru.folder.models;

import java.time.LocalDate;

public class User {
    private String name;
    private String password;
    private LocalDate localDate;

    public User(String name, String password, LocalDate localDate) {
        this.name = name;
        this.password = password;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
