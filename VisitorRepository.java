package com.jsp.visitorsDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.visitorsDataManagement.entity.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Integer> {

}
