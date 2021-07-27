package net.javaguides.springboot.springsecurity.model;

public class Animal {



    String name;
    String color;
    String category;


    public String getCategory() {
        return category;
    }

    public Animal setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Animal setColor(String color) {
        this.color = color;
        return this;
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setCategory("cat")
                .setColor("white")
                .setName("Kitty");
    }
}
