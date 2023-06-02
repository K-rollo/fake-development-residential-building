package pl.karolkoduje.fakedevelopmentresidentialbuilding.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Apartment {

    private int number;
    private double area;
    private int amountOfRooms;
    private Exposition sunExposition;
    private String buildingIndex;
    private int floorLevel;

    private boolean isAvailable;

    private String imgUrl;
}
