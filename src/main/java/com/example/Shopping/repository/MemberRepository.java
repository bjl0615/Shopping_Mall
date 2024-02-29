package com.example.Shopping.repository;


import com.example.Shopping.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>{
    Member findByEmail(String email);
}