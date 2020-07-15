package br.com.cassandra.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cassandra.portal.model.ClusterInfo;
import br.com.cassandra.portal.repository.ClusterInfoRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ClusterInfoController {
	
	@Autowired
	ClusterInfoRepository clusterInfo;
	
	@GetMapping("/clusterinfo")
	public List<ClusterInfo> getClusterInfo(){
		List<ClusterInfo> info;
		info = clusterInfo.getClusterInfo();	
		return info;
	}

}
