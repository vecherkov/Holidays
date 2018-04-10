package com.artem.repository;

import com.artem.model.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holiday, Long>{
    Holiday findByNameOfHoliday(String nameOfHoliday);
}
