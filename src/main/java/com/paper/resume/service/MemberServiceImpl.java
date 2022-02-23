package com.paper.resume.service;

import com.paper.resume.domain.Member;
import com.paper.resume.persistence.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public MemberFlag checkMember(Member member) {
        Member findMember = getMember(member);
        if(findMember == null)
            return MemberFlag.NOT_EXIST_MEMBER;
        else
            return MemberFlag.EXIST_MEMBER;
    }

    @Override
    public Member getMember(Member member) {

        Member findMember = memberRepository.findById(member.getId());

        return findMember;
    }

    @Override
    public void registerMember(Member member) {
        if(checkMember(member) != MemberFlag.EXIST_MEMBER)
            memberRepository.save(member);
    }
}
