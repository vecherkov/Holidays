package com.artem.service;

import com.artem.model.Holiday;
import com.artem.repository.HolidayRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HolidayService {
    private static final Log LOG = LogFactory.getLog(HolidayService.class);

    @Autowired
    private HolidayRepository holidayRepository;

    public List<Holiday> findAll(){
        return holidayRepository.findAll();
    }

    public Holiday findByNameOfHoliday(String nameOfHoliday){
        return holidayRepository.findByNameOfHoliday(nameOfHoliday);
    }

    public void save(Holiday holiday){
        holidayRepository.save(holiday);
    }

    public void delete(Holiday holiday){
        holidayRepository.delete(holiday);
    }

    public int count(){
        return (int) holidayRepository.count();
    }
}
