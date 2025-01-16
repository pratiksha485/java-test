package com.example.myAppS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myAppS.Entity.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findBySkillsContainingAndExperienceLessThan(String skill, int experience);
    List<Resource> findBySkillsContaining(String skill);
}