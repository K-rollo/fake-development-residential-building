package pl.karolkoduje.fakedevelopmentresidentialbuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Apartment;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Client;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.service.ApartmentService;

import java.util.List;

@Controller
public class HomeController {

    private final ApartmentService apartmentService;

    public HomeController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping("/")
    public String defaultView(Model model) {                               // thymeleaf needed to load home file
        List<Apartment> apartments = apartmentService.apartments();
        model.addAttribute("apartments", apartments);
        return "home";
    }

    @GetMapping("/available")
    public String available(Model model) {
        List<Apartment> apartments = apartmentService.availableApartments();
        model.addAttribute("apartments", apartments);
        return "home";
    }

    @GetMapping("/rooms/{amount}")
    public String requestedRoomAmount(Model model, @PathVariable int amount) {
        List<Apartment> apartments = apartmentService.amountOfRooms(amount);
        model.addAttribute("apartments", apartments);
        return "home";
    }
}
