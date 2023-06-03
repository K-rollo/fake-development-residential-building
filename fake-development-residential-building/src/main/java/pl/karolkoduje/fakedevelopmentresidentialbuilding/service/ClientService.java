package pl.karolkoduje.fakedevelopmentresidentialbuilding.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Client;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

   public List<Client> clients() {
       return clientRepository.findAll();
    }
    public Client client() {
        Optional<Client> found = clientRepository.findById(1);
        return found.get();
    }

//    public Client getClientById(int id) {
//        return clientsList.get(id);
//    }
}
