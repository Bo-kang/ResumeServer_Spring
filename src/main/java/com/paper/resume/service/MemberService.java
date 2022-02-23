package com.paper.resume.service;

import com.paper.resume.domain.Member;

public interface MemberService {
    enum MemberFlag{
        EXIST_MEMBER,
        NOT_EXIST_MEMBER
    }

    MemberFlag checkMember(Member member);

    Member getMember(Member member);

    void registerMember(Member member);

}

