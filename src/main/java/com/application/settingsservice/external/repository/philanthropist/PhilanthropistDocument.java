package com.application.settingsservice.external.repository.philanthropist;

import com.application.settingsservice.common.enums.CommunicationMethod;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "philanthropists")
public class PhilanthropistDocument {
    @NotNull
    @Id
    String id;

    @NotNull
    @Field(name = "communication_method")
    CommunicationMethod communicationMethod;
}
