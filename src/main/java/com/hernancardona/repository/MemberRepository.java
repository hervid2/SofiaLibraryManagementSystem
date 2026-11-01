package com.hernancardona.repository;

import com.hernancardona.model.entity.Member;

public class MemberRepository extends  GenericRepository<Member, Long> {
    public MemberRepository() {
        super(Member.class);
    }

}
