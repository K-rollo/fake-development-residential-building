package pl.karolkoduje.fakedevelopmentresidentialbuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Client;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.service.ApartmentService;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.service.ClientService;

import java.util.List;

@Controller
public class ClientController {

    private final ClientService clientService;
    private final ApartmentService apartmentService;

    public ClientController(ClientService clientService, ApartmentService apartmentService) {
        this.clientService = clientService;
        this.apartmentService = apartmentService;
    }


    @GetMapping("/clients")
    public String getClients(Model model) {
        List<Client> clients = clientService.clients();
        model.addAttribute("clients", clients);
        return "clients";
    }
//    @GetMapping("/client/{id}")
//    public Client getClient(@PathVariable int id) {
//        return clientService.getClientById(id);
//    }

    @GetMapping("/clients/back-homepage")
    public String backHome(Model model) {
        //TODO link from repository or inject apartments bean
//        List<Apartment> = apartmentService.apartments;
//        model.addAttribute("apartments", apartments);
        return "home";
    }


}
