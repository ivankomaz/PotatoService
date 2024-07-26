package ru.cft.potatoservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transfer {

    private int id;

    private int userId;

    private TransferType type;
    private double amount;

    private long receiverPhone;

    private long maintenanceNumber;
}
