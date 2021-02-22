package app.models;


import app.entities.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryModel {

    private static CategoryModel instance = new CategoryModel();

    private List<Category> model;

    public static CategoryModel getInstance() {
        return instance;
    }

    private CategoryModel() {
        model = new ArrayList<>();
    }

    public void add(Category category) {
        model.add(category);
    }

    public List<String> list() {
        return model.stream()
                .map(Category::getCategory_name)
                .collect(Collectors.toList());
    }
}
