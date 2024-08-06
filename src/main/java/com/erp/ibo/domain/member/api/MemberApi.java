package com.erp.ibo.domain.member.api;

import com.erp.ibo.domain.member.application.MemberSignUpService;
import com.erp.ibo.domain.member.application.MemberSearchService;
import com.erp.ibo.domain.member.dto.SignUpRequest;
import com.erp.ibo.domain.member.dto.MemberResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/members")
public class MemberApi {

    @Autowired
    private MemberSignUpService memberSignUpService;

    @Autowired
    private MemberSearchService memberSearchService;

    @PostMapping
    public void signUp(@RequestBody SignUpRequest request) {
        memberSignUpService.signUp(request);
    }

    @GetMapping("/{id}")
    public MemberResponse getMember(@PathVariable(name = "id") Long id) {
        return memberSearchService.getMemberById(id);
    }
}