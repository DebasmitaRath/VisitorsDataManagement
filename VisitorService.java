package com.jsp.visitorsDataManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.visitorsDataManagement.entity.Visitor;

@Service
public class VisitorService {
	
	@Autowired
	private com.jsp.visitorsDataManagement.repository.VisitorDAO dao;
	
	public Visitor saveVisitor(Visitor visitor) {
		return dao.saveVisitor(visitor);
	}
	
	public List<Visitor> getAllVisitorData() {
		return dao.getAllVisitorData();
	}
	
	public Optional<Visitor> getVisitorById(int id) {
		return dao.getVisitorById(id);
	}
	
	public Optional<Visitor> deleteVisitorById(int id) {
		 return dao.deleteVisitorById(id);
	}

}
