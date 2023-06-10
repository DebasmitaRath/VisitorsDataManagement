package com.jsp.visitorsDataManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.visitorsDataManagement.entity.Visitor;
import com.jsp.visitorsDataManagement.service.VisitorService;

@RestController
public class VisitorController {
	
	@Autowired
	private VisitorService service;
	
	@PostMapping("/savevisitors")
	public @ResponseBody Visitor saveVisitors(@RequestBody Visitor visitor) {
		return service.saveVisitor(visitor);
	}
	
	@GetMapping("/getAllVisitors")
	public @ResponseBody List<Visitor> getAllVisitorData() {
		return service.getAllVisitorData();
	}
	
	@GetMapping("/getVisitorByid/{id}")
	public @ResponseBody Optional<Visitor> getVisitorById(@PathVariable("id") int id) {
		return service.getVisitorById(id);
	}
	
	@PutMapping("/updateVisitor")
	public @ResponseBody Visitor updateVisitor(@RequestBody Visitor visitor) {
		return service.saveVisitor(visitor);
	}
	
	@DeleteMapping("/deleteVisitorByid/{id}")
	public @ResponseBody  Optional<Visitor> deleteVisitorById(@PathVariable("id") int id) {
		 return service.deleteVisitorById(id);
	}

}
