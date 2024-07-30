package ru.cft.potatoservice.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
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

    private String password;
}
