package com.paper.resume.persistence;

import com.paper.resume.domain.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Integer> {

    Member findById(String memberID);
}
