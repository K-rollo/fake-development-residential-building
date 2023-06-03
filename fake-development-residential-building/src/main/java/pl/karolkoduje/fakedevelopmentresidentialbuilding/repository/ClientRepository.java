package pl.karolkoduje.fakedevelopmentresidentialbuilding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
