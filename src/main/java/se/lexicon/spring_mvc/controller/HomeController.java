package se.lexicon.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
@Controller
public class HomeController {


    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }

    @GetMapping("/welcome")
    public String getWelcomePage(){
        return "welcome";
    }
}
