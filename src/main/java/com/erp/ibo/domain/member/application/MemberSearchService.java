package com.erp.ibo.domain.member.application;

import com.erp.ibo.domain.member.dao.MemberRepository;
import com.erp.ibo.domain.member.domain.Member;
import com.erp.ibo.domain.member.dto.MemberResponse;
import com.erp.ibo.domain.member.exception.MemberNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberSearchService {

    @Autowired
    private MemberRepository memberRepository;

    public MemberResponse getMemberById(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(() -> new MemberNotFoundException("Member not found"));
        return new MemberResponse(member.getId(), member.getName(), member.getEmail());
    	
    }
}