package pl.karolkoduje.fakedevelopmentresidentialbuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.service.ClientService;

@Controller
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("/clients")
    public String clientsHome() {
        System.out.println(clientService.clients());
        return "clientsHome";
    }

    @GetMapping("/clients/back-home-page")
    public String backHome() {
        return "home";
    }


}
