package com.application.settingsservice.services.impl;

import com.application.settingsservice.common.value.Philanthropist;
import com.application.settingsservice.controllers.dto.PhilanthropistViewResponseDTO;
import com.application.settingsservice.external.repository.IPhilanthropistRepository;
import com.application.settingsservice.services.IPhilanthropistService;
import org.springframework.stereotype.Service;

@Service
public class PhilanthropistService implements IPhilanthropistService {
    private final IPhilanthropistRepository philanthropistRepository;

    public PhilanthropistService(final IPhilanthropistRepository philanthropistRepository) {
        this.philanthropistRepository = philanthropistRepository;
    }

    @Override
    public PhilanthropistViewResponseDTO getPhilanthropistById(final String identity) {
        return new PhilanthropistViewResponseDTO(philanthropistRepository.getPhilanthropistById(identity));
    }

    @Override
    public PhilanthropistViewResponseDTO savePhilanthropist(final Philanthropist philanthropist) {
        return new PhilanthropistViewResponseDTO(philanthropistRepository.persistPhilanthropist(philanthropist));
    }
}
