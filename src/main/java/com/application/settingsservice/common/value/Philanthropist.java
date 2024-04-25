package com.application.settingsservice.common.value;

import com.application.settingsservice.common.enums.CommunicationMethod;

public class Philanthropist {
    private String id;
    private CommunicationMethod communicationMethod;

    public Philanthropist(String id, CommunicationMethod communicationMethod) {
        this.id = id;
        this.communicationMethod = communicationMethod;
    }

    public String getId() {
        return id;
    }

    public CommunicationMethod getCommunicationMethod() {
        return communicationMethod;
    }
}
