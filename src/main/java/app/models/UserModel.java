package app.models;


import app.entities.Category;
import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserModel {

    private static UserModel instance = new UserModel();

    private List<User> model;

    public static UserModel getInstance() {
        return instance;
    }

    private UserModel() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
