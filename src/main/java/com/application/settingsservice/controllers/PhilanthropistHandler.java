package com.application.settingsservice.controllers;

import com.application.settingsservice.controllers.dto.CreatePhilanthropistRequestDTO;
import com.application.settingsservice.controllers.dto.PhilanthropistViewResponseDTO;
import com.application.settingsservice.services.IPhilanthropistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class PhilanthropistHandler {
    private final IPhilanthropistService philanthropistService;

    public PhilanthropistHandler(final IPhilanthropistService philanthropistService) {
        this.philanthropistService = philanthropistService;
    }

    @GetMapping("/philanthropists/{philanthropistId}")
    public ResponseEntity<PhilanthropistViewResponseDTO> getPhilanthropistById(
            @PathVariable String philanthropistId) {
        return new ResponseEntity<>(this.philanthropistService.getPhilanthropistById(philanthropistId), HttpStatus.OK);
    }

    @PostMapping("/philanthropists")
    public ResponseEntity<PhilanthropistViewResponseDTO> createPhilanthropist(
            @RequestBody CreatePhilanthropistRequestDTO requestDTO) {
        return new ResponseEntity<>(this.philanthropistService.savePhilanthropist(requestDTO.toPhilanthropist()), HttpStatus.CREATED);
    }
}
