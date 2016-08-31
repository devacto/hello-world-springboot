package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToDo {

    private String name;

    public ToDo() {
        super();
    }

    public ToDo(String name) {
        this.name = name;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }
}
