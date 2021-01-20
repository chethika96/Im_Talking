package com.sentura.ImTalkingToYou.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

        @GetMapping("/home" )
        public String firstPage() {
            return "Hello world ";
        }
}
