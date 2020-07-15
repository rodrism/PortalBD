package br.com.cassandra.portal.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import br.com.cassandra.portal.model.ClusterInfo;

public interface ClusterInfoRepository extends CassandraRepository<ClusterInfo, String>{

	@Query("select * from system.local;")
	public List<ClusterInfo> getClusterInfo() ;
	
}
