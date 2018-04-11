package com.artem.service;

import com.artem.model.Holiday;
import com.artem.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Artem Vecher on 12.11.2017.
 */

@Service
public class CheckerWeekend {

    @Autowired
    private HolidayService holidayService ;

    public int countOfWeekend(LocalDate startDate, LocalDate endDate) {
        List<Holiday> holidays = holidayService.findAll();
        int weekdays = 0;
        if (startDate.isEqual(endDate)) {
            return weekdays;
        }

        while(startDate.isBefore(endDate)) {
            for(Holiday holiday: holidays){
                if(holiday.getDateOfHoliday().equals(startDate) && !DayOfWeek.SATURDAY.equals(holiday.getDateOfHoliday())
                        && !DayOfWeek.SUNDAY.equals(holiday.getDateOfHoliday())){
                    weekdays++;
                }
            }
            if (DayOfWeek.SATURDAY.equals(startDate.getDayOfWeek())
                    || DayOfWeek.SUNDAY.equals(startDate.getDayOfWeek())) {
                weekdays++;
            }

            startDate = startDate.plusDays(1);
        }

        return weekdays;
    }
}
