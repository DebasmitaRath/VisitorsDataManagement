package com.jsp.visitorsDataManagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.visitorsDataManagement.entity.Visitor;

@Repository
public class VisitorDAO {

	@Autowired
	private VisitorRepository repository;

	public Visitor saveVisitor(Visitor visitor) {
		return repository.save(visitor);
	}
	
	public List<Visitor> getAllVisitorData() {
		return repository.findAll();
	}
	
	public Optional<Visitor> getVisitorById(int id) {
		return repository.findById(id);
	}
	
	public Optional<Visitor> deleteVisitorById(int id) {
		 Optional<Visitor> visitorById = getVisitorById(id);
		 repository.deleteById(id);
		 return visitorById;
	}
}
