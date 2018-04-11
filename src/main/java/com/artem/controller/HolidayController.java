package com.artem.controller;

import com.artem.service.CheckerWeekend;
import com.artem.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    @Autowired
    private CheckerWeekend checkerWeekend;

    @RequestMapping(value="/holidays", method = RequestMethod.GET)
    public ModelAndView holidaysPage() {
        return new ModelAndView("holidays");
    }

    @RequestMapping(value = "/holidays", method = RequestMethod.POST)
    public ModelAndView countWeekdays(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                      @RequestParam  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  LocalDate endDate,
                                      ModelMap modelMap) {

        int week = checkerWeekend.countOfWeekend(startDate, endDate);
        modelMap.addAttribute("weekdays",week);
        return new ModelAndView("holidays");
    }
}
