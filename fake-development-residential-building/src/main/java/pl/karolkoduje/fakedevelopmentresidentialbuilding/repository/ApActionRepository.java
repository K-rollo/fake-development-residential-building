package pl.karolkoduje.fakedevelopmentresidentialbuilding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.karolkoduje.fakedevelopmentresidentialbuilding.model.ApAction;

import javax.swing.*;
import java.util.List;

@Repository
public interface ApActionRepository extends JpaRepository<ApAction, Integer> {
}

