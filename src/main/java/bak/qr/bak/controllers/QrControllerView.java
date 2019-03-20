package bak.qr.bak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class QrControllerView {


    @RequestMapping(value = "/letturaqr", method = RequestMethod.GET)
    public ModelAndView signup() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("letturaqr");
        return modelAndView;
    }


}
