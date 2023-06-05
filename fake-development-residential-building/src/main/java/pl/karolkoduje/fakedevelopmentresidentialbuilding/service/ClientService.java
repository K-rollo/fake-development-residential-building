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

    public Client getClientById(int id) {
        Optional<Client> found = clientRepository.findById(id);
        return found.orElseGet(Client::new);
      }

    public List<Client> getListWithRemovedClient(int id) {
        System.out.println(clientRepository.findAll().stream()
                .map(client -> client.getId())
                .toList());
        clientRepository.deleteAll();
        System.out.println(clientRepository.findAll().stream()
                .map(client -> client.getId())
                .toList());
        return clientRepository.findAll();
    }

}
