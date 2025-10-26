package br.com.luizdasilva.moneyflowcontrol_api.enums;

import lombok.Getter;

@Getter
public enum UserType {
    DEFAULT("Default"),
    ADMIN("Admin");

    private final String name;

    UserType(String name) {
        this.name = name;
    }
}
