package com.love.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/love")
public class LoginController {

    @PostMapping("/login")
    public String login() {
        return "";
    }
}
