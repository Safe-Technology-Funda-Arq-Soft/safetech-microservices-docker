package com.api.safetech.appointmentservice.appointment.domain.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Appliance {
    private Long id;
    private String name;
    private  Float cost;
}
