package com.application.settingsservice.external.repository;

import com.application.settingsservice.common.value.Philanthropist;

public interface IPhilanthropistRepository {
    Philanthropist persistPhilanthropist(final Philanthropist philanthropist);

    Philanthropist getPhilanthropistById(final String identity);
}
