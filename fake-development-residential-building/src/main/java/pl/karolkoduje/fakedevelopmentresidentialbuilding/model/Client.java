package pl.karolkoduje.fakedevelopmentresidentialbuilding.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String street;
    private String numberAsString;
    private String city;
    private String zipCodeAsString;
    private String phoneNumberAsString;
    private String emailAddressAsString;
}
