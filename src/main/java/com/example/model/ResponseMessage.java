package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseMessage {

    private String message;

    public ResponseMessage(String message) {
        this.message = message;
    }

    @JsonProperty
    public String getMessage() {
        return message;
    }
}
