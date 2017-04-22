package org.cong.x.project.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liaojuncong on 04/10/2016.
 */
@Slf4j
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        log.info("hello");

        model.addAttribute("name", name);
        return "hello";
    }
}
