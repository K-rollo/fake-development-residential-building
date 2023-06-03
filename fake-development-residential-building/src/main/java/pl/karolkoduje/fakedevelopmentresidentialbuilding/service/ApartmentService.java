package pl.karolkoduje.fakedevelopmentresidentialbuilding.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Apartment;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.repository.ApartmentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;

    public List<Apartment> apartments() {
        return apartmentRepository.findAll();
    }
    public List<Apartment> availableApartments() {
        return apartmentRepository.findAll().stream()
                .filter(apartment -> apartment.getStatus().equalsIgnoreCase("available"))
                .toList();
    }

    public List<Apartment> amountOfRooms(int amount) {
        return apartmentRepository.findAll().stream()
                .filter(apartment -> apartment.getAmountOfRooms() == amount)
                .toList();
    }
}
