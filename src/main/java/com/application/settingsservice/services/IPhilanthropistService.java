package com.application.settingsservice.services;

import com.application.settingsservice.common.value.Philanthropist;
import com.application.settingsservice.controllers.dto.PhilanthropistViewResponseDTO;

public interface IPhilanthropistService {
    PhilanthropistViewResponseDTO getPhilanthropistById(final String identity);

    PhilanthropistViewResponseDTO savePhilanthropist(final Philanthropist philanthropist);
}
