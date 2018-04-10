package com.artem.controller;

import com.artem.CheckerWeekend;
import com.artem.model.User;
import com.artem.service.HolidayService;
import com.artem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/holidays")
public class HolidaysController {

    @Autowired
    private HolidayService holidayService;
    private CheckerWeekend checkerWeekend = new CheckerWeekend();


    @RequestMapping(value = "/holidays", method = RequestMethod.POST)
    public int countWeekdays(@RequestParam LocalDate startDate, LocalDate endDate) {
        int week = checkerWeekend.countOfWeekend(startDate, endDate);
        return week;
    }
}
