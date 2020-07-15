package br.com.cassandra.portal.model;

import java.util.HashMap;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("keyspaces")
public class Keyspace {

	@PrimaryKey
	@Column("keyspace_name")
	String keyspace_name;
	
	@Column("durable_writes")
	Boolean durable_writes;
	
	@Column("replication")
	HashMap<String, Object> replication;
	
	public Keyspace(String keyspace_name, Boolean durable_writes, HashMap<String, Object> replication) {
		this.keyspace_name = keyspace_name;
		this.durable_writes = durable_writes;
		this.replication = replication;
	}
	
	public String getKeyspace_name() {
		return keyspace_name;
	}
	public void setKeyspace_name(String keyspace_name) {
		this.keyspace_name = keyspace_name;
	}
	public HashMap<String, Object> getReplication() {
		return replication;
	}
	public void setReplication(HashMap<String, Object> replication) {
		this.replication = replication;
	}
	public Boolean getDurable_writes() {
		return durable_writes;
	}
	public void setDurable_writes(Boolean durable_writes) {
		this.durable_writes = durable_writes;
	}

	@Override
	public String toString() {
		return "Keyspace [keyspace_name=" + keyspace_name + ", replication=" + replication + "]";
	}	
	
}
