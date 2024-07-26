package ru.cft.potatoservice.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserSession
{
    private int uuin;

    private int userUuin;

    private Date expirationDate;

    private boolean active;

    private String token;
}
