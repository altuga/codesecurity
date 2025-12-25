package org.jugistanbul.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root(Authentication authentication) {
        if (authentication != null && authentication.isAuthenticated()) {
            return "redirect:/myAccount";
        }
        return "redirect:/login";
    }

    @GetMapping("/home")
    @ResponseBody
    public String home(Authentication authentication) {
        if (authentication != null && authentication.isAuthenticated()) {
            return "Welcome back, " + authentication.getName();
        }
        return "Welcome to the Bank app. Please log in.";
    }

}
