package org.cong.x.project.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liaojuncong on 04/10/2016.
 */
@Slf4j
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        log.info("index");
        return "forward:app/index.html";
    }
}
