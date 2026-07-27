package entities;

import java.time.Year;

public class Author {
    private String name;
    private String nationality;
    private Integer birthYear;

    public Author() {
    }
    public Author(String name, String nationality, Integer birthYear){
        this.name = name;
        this.nationality = nationality;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public Integer getCurrentAge() {
        Integer currentYear = Year.now().getValue();

        Integer age = currentYear - birthYear;
        return age;

    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nNationality: " + nationality +
                "\nBirth Year: " + birthYear;
    }
}
