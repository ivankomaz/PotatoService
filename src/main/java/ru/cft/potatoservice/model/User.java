package ru.cft.potatoservice.model;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int uuid;
    private String firstName;

    private String middleName;

    private String lastName;

    private long phone;

    private String email;

    private Date birthDate;

    private Date registrationDate;

    private Date lastUpdateDate;
}
