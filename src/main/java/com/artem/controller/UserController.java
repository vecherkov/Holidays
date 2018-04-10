package com.artem.controller;

import com.artem.model.User;
import com.artem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView buttonHome() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkUser(@ModelAttribute("login") User user, ModelMap model) {

        if (userService.checkUserByLoginAndPassword(user.getLogin(), user.getPassword())) {
            return "redirect:/holidays";
        } else {
            return "redirect:/login";
        }
    }
}
