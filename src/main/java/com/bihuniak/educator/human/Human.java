package com.bihuniak.educator.human;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Human {
    @Id
    @GeneratedValue
    private long id;
    @Embedded
    private Adress adress;
    @ElementCollection
    private List<String> phones = new ArrayList<>();


    private String name;
    private String surname;
    @Enumerated(value = EnumType.STRING)
    private Sex sex;
    private LocalDate birthday;

    public Human(String name, String surname, Sex sex, LocalDate birthday, Adress adress, List<String> phones) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.birthday = birthday;
        this.adress = adress;
        this.phones = phones;
    }
}
