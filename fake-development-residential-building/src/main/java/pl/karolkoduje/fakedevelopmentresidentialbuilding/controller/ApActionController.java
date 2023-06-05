package pl.karolkoduje.fakedevelopmentresidentialbuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.ApAction;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.service.ApActionService;

import java.util.List;

@Controller
public class ApActionController {

    private final ApActionService apActionService;

    public ApActionController(ApActionService apActionService) {
        this.apActionService = apActionService;
    }

    @GetMapping("/apartments-actions")
    public String getActions(Model model) {
        List<ApAction> apActions = apActionService.getAllActions();
        model.addAttribute("apactions", apActions);
        return "apartments-actions";
    }

    @GetMapping("/action/book")
    public String bookAction(@RequestParam int apartmentId, @RequestParam int clientId, Model model) {
        apActionService.addActionToRepository(apartmentId, clientId, "Booked");
        List<ApAction> apActions = apActionService.getAllActions();
        model.addAttribute("apactions", apActions);
        return "apartments-actions";
    }


}
