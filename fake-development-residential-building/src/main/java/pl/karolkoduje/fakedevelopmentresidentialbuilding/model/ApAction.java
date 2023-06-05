package pl.karolkoduje.fakedevelopmentresidentialbuilding.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class ApAction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer apartmentId;
    private String actionType;
    private Integer clientId;
    private LocalDateTime created;

    public ApAction(Integer apartmentId, String actionType) {
        this.setApartmentId(apartmentId);
        this.setActionType(actionType);
        this.setCreated(now());
    }

    public ApAction(Integer apartmentId, String actionType, Integer clientId) {
        this.setApartmentId(apartmentId);
        this.setActionType(actionType);
        this.setClientId(clientId);
        this.setCreated(now());
    }
}
