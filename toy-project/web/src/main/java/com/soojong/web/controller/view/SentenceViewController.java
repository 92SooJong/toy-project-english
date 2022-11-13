package com.soojong.web.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SentenceViewController {

    @GetMapping
    public ModelAndView main() {
        return new ModelAndView("/sentence/input_sentence");
    }
}
