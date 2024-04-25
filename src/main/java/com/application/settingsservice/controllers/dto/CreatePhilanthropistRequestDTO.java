package com.application.settingsservice.controllers.dto;

import com.application.settingsservice.common.enums.CommunicationMethod;
import com.application.settingsservice.common.value.Philanthropist;

public record CreatePhilanthropistRequestDTO(String id, CommunicationMethod communicationMethod) {
    public Philanthropist toPhilanthropist() {
        return new Philanthropist(id, communicationMethod);
    }
}
