package org.example.Streams;

import java.util.Objects;

public class LightNovels {
    private String title;
    private Double price;
    private Category category;

    public LightNovels(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public LightNovels(String title, Double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "LightNovels{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovels that = (LightNovels) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
