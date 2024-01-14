package ru.sergeypyzyn.enums;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public enum HolidayDate {

    NEW_YEAR (LocalDate.of(2024, 1, 1)),
    DEFENDER_OF_FATHERLAND_DAY(LocalDate.of(2024,2,23)),
    INTERNATIONAL_WOMAN_DAY (LocalDate.of(2024, 3, 8)),
    SPRING_AND_LABOR_DAY(LocalDate.of(2024,5,1)),
    VICTORY_DAY(LocalDate.of(2024, 5, 9));

    private final LocalDate date;

    HolidayDate(LocalDate date){
        this.date = date;
    }



}
