package ru.sergeypyzyn;

import lombok.*;



@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Gender {

    MALE ("Мужчина"),
    FEMALE ("Женщина");


    private String title;


    @Override
    public String toString() {
        return String.format("Пол: %s", title);
    }
}
