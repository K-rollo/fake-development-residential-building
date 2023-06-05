package pl.karolkoduje.fakedevelopmentresidentialbuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Client;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.service.ApartmentService;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.service.ClientService;

import java.util.ArrayList;
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

    @GetMapping("/client/{id}")
    public String getClient(@PathVariable int id, Model model) {
        List<Client> clients = new ArrayList<>();
        Client client = clientService.getClientById(id);
        if(!client.getId().equals(null)){
            clients.add(client);
        };
        model.addAttribute("clients", clients);
        return "clients";

    }

    @GetMapping("/clients/delete/{id}")
    public String deleteClient(@PathVariable int id, Model model) {
        List<Client> clients = clientService.getListWithRemovedClient(id);
        model.addAttribute("clients", clients);
        return "clients";
    }

    @PostMapping("/clients/new")
    public String addNewClient(@PathVariable int id, Model model) {
        List<Client> clients = clientService.getListWithRemovedClient(id);
        model.addAttribute("clients", clients);
        return "clients";
    }
}
