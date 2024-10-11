package com.security.SpringSecurity;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        log.info("Printing Session Id");
        return "Hello World" + request.getSession().getId();
    }
}
