package br.com.cassandra.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.cassandra.core.CassandraAdminTemplate;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cassandra.portal.model.Role;
import br.com.cassandra.portal.repository.RoleRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class RoleController {
	
	@Autowired
	RoleRepository repository;
	
	public String keyspace = "system_auth";
	
	@GetMapping("/roles")
	public List<Role> listAllRoles(){
		
		List<Role> roles;
		
		roles = repository.findAllRoles();
		
		return roles;
	}
}
