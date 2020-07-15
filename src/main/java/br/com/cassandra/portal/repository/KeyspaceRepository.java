package br.com.cassandra.portal.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import br.com.cassandra.portal.model.Keyspace;

public interface KeyspaceRepository extends CassandraRepository<Keyspace, String>{

}
