package br.com.cassandra.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cassandra.portal.model.Keyspace;
import br.com.cassandra.portal.repository.KeyspaceRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class KeyspaceController {
	
	@Autowired
	KeyspaceRepository repository;

	@GetMapping("/keyspaces")
	public List<Keyspace> listAllKeyspaces(){
		
		List<Keyspace> keyspaces;
		
		keyspaces = repository.findAll();
		
		return keyspaces;
	}
	
	
}
