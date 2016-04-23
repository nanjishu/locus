package com.locus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by gonglei on 16/4/22.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/velocityTest", method = RequestMethod.GET)
    public ModelAndView index() {

        return new ModelAndView("testPage1");
    }
}
