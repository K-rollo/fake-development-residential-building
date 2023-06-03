package pl.karolkoduje.fakedevelopmentresidentialbuilding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
}
