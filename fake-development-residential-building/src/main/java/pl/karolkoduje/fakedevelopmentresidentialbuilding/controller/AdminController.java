package pl.karolkoduje.fakedevelopmentresidentialbuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private String adminPage() {
        return "adminview/modify";
    }
}
