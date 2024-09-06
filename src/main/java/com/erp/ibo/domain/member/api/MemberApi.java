package com.erp.ibo.domain.member.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.ibo.domain.member.dto.MemberResponse;

@RestController
@RequestMapping("/api/members")
public class MemberApi {


    @GetMapping("/{id}")
    public String getMember(@PathVariable(name = "id") Long id) {
    	String title = "hellworld" + id;
    	
    	return title;
    }
        
   
}