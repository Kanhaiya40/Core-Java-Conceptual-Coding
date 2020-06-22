package oracledocumentation.chapter4;

import java.time.LocalDate;

public class Person {

    private final LocalDate birthday;
    private final Sex gender;
    private final String emailAddress;
    private final String name;


    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }


    public Sex getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }


    public enum Sex {
        MALE, FEMALE
    }
}