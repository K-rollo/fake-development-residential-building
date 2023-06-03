package pl.karolkoduje.fakedevelopmentresidentialbuilding.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Apartment {

    @Id
    private Integer id;
    private String building;
    private String staircase;
    private Integer floor;
    private Integer apartmentNumber;
    private Float apartmentArea;
    private Integer amountOfRooms;
    private String status;
    private Integer clientId;
}
