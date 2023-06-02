package pl.karolkoduje.fakedevelopmentresidentialbuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Apartment;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Exposition;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private List<Apartment> apartments = new ArrayList();

    { // TODO mapper from the external file
        apartments.add(new Apartment(1, 100.00, 4, Exposition.SOUTH, "A", 0, true,
                "apartment-1.jpg"));
        apartments.add(new Apartment(2, 55.00, 2, Exposition.EAST, "B", 1, true,
                "apartment-2.jpg"));
        apartments.add(new Apartment(3, 80.00, 3, Exposition.NORTH_EAST, "C", 2, true,
                "apartment-3.jpg"));
    }

    @GetMapping("/")
    public String home(Model model) {                               // thymeleaf needed to load home file
        model.addAttribute("apartments", apartments);
        return "home";
    }

}
