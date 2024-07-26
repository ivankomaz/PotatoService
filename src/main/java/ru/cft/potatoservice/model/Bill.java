package ru.cft.potatoservice.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Bill {

    private int id;

    private double amount;


    private Date lastUpdateDate;

}
