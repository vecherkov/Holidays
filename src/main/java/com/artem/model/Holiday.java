package com.artem.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Artem Vecher on 12.11.2017.
 */
@Entity
@Table(name = "holiday")
@Setter
@Getter
@EqualsAndHashCode
public class Holiday {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "dateOfHoliday")
    private LocalDate dateOfHoliday;

    @Column(name = "nameOfHoliday")
    private String nameOfHoliday;

    public LocalDate getDateOfHoliday() {
        return dateOfHoliday;
    }
}
