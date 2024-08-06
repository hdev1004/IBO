package com.erp.ibo.domain.member.dto;

public class SignUpRequest {
    private String name;
    private String email;

    public SignUpRequest() {
    }

    public SignUpRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}