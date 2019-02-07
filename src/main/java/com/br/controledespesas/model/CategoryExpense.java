package com.br.controledespesas.model;

import org.springframework.data.annotation.Id;

public class CategoryExpense {

    @Id
    private Long id;
    private String title;
    private String color;
    private String image;

    public CategoryExpense() {
    }

    public CategoryExpense(String title, String color, String image) {
        this.title = title;
        this.color = color;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public String getImage() {
        return image;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CategoryExpense{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
