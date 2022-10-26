package model;

import java.time.LocalDate;

public class Pet {
    private String id;
    private String name;
    private String species;
    private int age;
    private String sex;
    private String description;
    private TYPE type;
    private String images;

    public Pet() {
    }

    public Pet(String id, String name, String species, int age, String sex, String description,TYPE type) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        System.out.printf("Mã: %s - Tên: %s - Giống: %s - Tuổi: %s - Giới Tính: %s - Đặc Điểm: %s - Loại: %s ", id, name, species, age, sex, description, type +"\n");
        return "--------------------------------------";

    }
}
