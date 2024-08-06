package com.erp.ibo.domain.member.dto;

public class MemberResponse {
    private Long id;
    private String name;
    private String email;
    private String errCode;
    
    public MemberResponse(String errCode) {
    	this.errCode = errCode;
    }
    
    public MemberResponse(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public String errCode() {
    	return errCode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}