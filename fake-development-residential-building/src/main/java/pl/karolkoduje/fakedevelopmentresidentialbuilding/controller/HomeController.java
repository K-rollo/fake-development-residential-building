package pl.karolkoduje.fakedevelopmentresidentialbuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Apartment;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Exposition;

import java.util.ArrayList;

@Controller
public class HomeController {

    private ArrayList apartments = new ArrayList();

    {
        apartments.add(new Apartment(1, 100.00, 4, Exposition.SOUTH, "A", 0, true,
                "apartment-1.jpg"));
    }

    @GetMapping("/")
    public String home(Model model) {                               // thymeleaf needed to load home file
        model.addAttribute("apartments", apartments);
        return "home";
    }


}
