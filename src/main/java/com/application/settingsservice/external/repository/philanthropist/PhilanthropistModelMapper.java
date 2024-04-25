package com.application.settingsservice.external.repository.philanthropist;

import com.application.settingsservice.common.value.Philanthropist;

public class PhilanthropistModelMapper {
    static PhilanthropistDocument toDocument(final Philanthropist philanthropist) {
        PhilanthropistDocument philanthropistDocument = new PhilanthropistDocument();

        philanthropistDocument.id = philanthropist.getId();
        philanthropistDocument.communicationMethod = philanthropist.getCommunicationMethod();

        return philanthropistDocument;
    }

    static Philanthropist toPhilanthropist(final PhilanthropistDocument philanthropistDocument) {
        return new Philanthropist(philanthropistDocument.id, philanthropistDocument.communicationMethod);
    }
}
