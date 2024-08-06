package com.erp.ibo.domain.member.application;

import com.erp.ibo.domain.member.dao.MemberRepository;
import com.erp.ibo.domain.member.domain.Member;
import com.erp.ibo.domain.member.dto.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberSignUpService {

    @Autowired
    private MemberRepository memberRepository;

    public void signUp(SignUpRequest request) {
        Member member = new Member(request.getName(), request.getEmail());
        memberRepository.save(member);
    }
}