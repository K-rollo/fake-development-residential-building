package pl.karolkoduje.fakedevelopmentresidentialbuilding.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.domain.ServiceResponse;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.ApAction;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.repository.ApActionRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ApActionService {
    private final ApActionRepository apActionRepository;

    public ServiceResponse addBookActionToRepository(Integer apartmentId, Integer clientId) {
        return addActionToRepository(apartmentId, clientId, "Booked");
    }

    public ServiceResponse addSoldActionToRepository(Integer apartmentId, Integer clientId) {
        return addActionToRepository(apartmentId, clientId, "Sold");
    }

    public ServiceResponse addAvailableActionToRepository(Integer apartmentId) {
        List<ApAction> actionsList = apActionRepository.findAll();
        if ((actionsList.size() > 0) &&
                !(actionsList
                        .get(actionsList.size() - 1)
                        .getActionType()
                        .equalsIgnoreCase("Available"))) {
            //TODO provide exception handler
            ApAction createdAction = new ApAction(apartmentId, "Available");
            apActionRepository.save(createdAction);
            return ServiceResponse.SUCCED;
        } else {
            return ServiceResponse.FAILED;
        }
    }

    public ServiceResponse addActionToRepository(Integer apartmentId, Integer clientId, String action) {
        List<ApAction> actionsList = apActionRepository.findAll();
        if ((actionsList.size() == 0) ||
                !(actionsList
                        .get(actionsList.size() - 1)
                        .getActionType()
                        .equalsIgnoreCase(action))) {
            //TODO provide exception handler
            apActionRepository.save(new ApAction(apartmentId, action, clientId));
            return ServiceResponse.SUCCED;
        } else {
            return ServiceResponse.FAILED;
        }
    }

    public List<ApAction> getAllActions() {
        return apActionRepository.findAll();
    }
}
