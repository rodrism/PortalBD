package br.com.cassandra.portal.model;

import java.net.InetAddress;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.oss.driver.api.core.uuid.Uuids;

@Table("local")
public class ClusterInfo {
	
	@PrimaryKey
    public String key;
    public String bootstrapped;
    public InetAddress broadcast_address;
    public String cluster_name;
    public String cql_version;
    public String data_center;
    public String dse_version;
    public int gossip_generation;
    public Boolean graph;
    public UUID host_id;
    public int jmx_port ;
    public InetAddress listen_address;
    public String native_protocol_version;
    public InetAddress native_transport_address;
    public int native_transport_port;
    public int native_transport_port_ssl;
    public String partitioner;
    public String rack;
    public String release_version;
    public InetAddress rpc_address;
    public UUID schema_version;
    public String server_id;
    public int storage_port;
    public int storage_port_ssl;
    public Set<String> tokens;
    public String workload;
    public Set<String> workloads;
    
	public ClusterInfo(String key, String bootstrapped, InetAddress broadcast_address, String cluster_name,
			String cql_version, String data_center, String dse_version, int gossip_generation, Boolean graph,
			UUID host_id, int jmx_port, InetAddress listen_address, String native_protocol_version,
			InetAddress native_transport_address, int native_transport_port, int native_transport_port_ssl,
			String partitioner, String rack, String release_version, InetAddress rpc_address, UUID schema_version,
			String server_id, int storage_port, int storage_port_ssl, Set<String> tokens, String workload,
			Set<String> workloads) {
		this.key = key;
		this.bootstrapped = bootstrapped;
		this.broadcast_address = broadcast_address;
		this.cluster_name = cluster_name;
		this.cql_version = cql_version;
		this.data_center = data_center;
		this.dse_version = dse_version;
		this.gossip_generation = gossip_generation;
		this.graph = graph;
		this.host_id = host_id;
		this.jmx_port = jmx_port;
		this.listen_address = listen_address;
		this.native_protocol_version = native_protocol_version;
		this.native_transport_address = native_transport_address;
		this.native_transport_port = native_transport_port;
		this.native_transport_port_ssl = native_transport_port_ssl;
		this.partitioner = partitioner;
		this.rack = rack;
		this.release_version = release_version;
		this.rpc_address = rpc_address;
		this.schema_version = schema_version;
		this.server_id = server_id;
		this.storage_port = storage_port;
		this.storage_port_ssl = storage_port_ssl;
		this.tokens = tokens;
		this.workload = workload;
		this.workloads = workloads;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getBootstrapped() {
		return bootstrapped;
	}

	public void setBootstrapped(String bootstrapped) {
		this.bootstrapped = bootstrapped;
	}

	public InetAddress getBroadcast_address() {
		return broadcast_address;
	}

	public void setBroadcast_address(InetAddress broadcast_address) {
		this.broadcast_address = broadcast_address;
	}

	public String getCluster_name() {
		return cluster_name;
	}

	public void setCluster_name(String cluster_name) {
		this.cluster_name = cluster_name;
	}

	public String getCql_version() {
		return cql_version;
	}

	public void setCql_version(String cql_version) {
		this.cql_version = cql_version;
	}

	public String getData_center() {
		return data_center;
	}

	public void setData_center(String data_center) {
		this.data_center = data_center;
	}

	public String getDse_version() {
		return dse_version;
	}

	public void setDse_version(String dse_version) {
		this.dse_version = dse_version;
	}

	public int getGossip_generation() {
		return gossip_generation;
	}

	public void setGossip_generation(int gossip_generation) {
		this.gossip_generation = gossip_generation;
	}

	public Boolean getGraph() {
		return graph;
	}

	public void setGraph(Boolean graph) {
		this.graph = graph;
	}

	public UUID getHost_id() {
		return host_id;
	}

	public void setHost_id(UUID host_id) {
		this.host_id = host_id;
	}

	public int getJmx_port() {
		return jmx_port;
	}

	public void setJmx_port(int jmx_port) {
		this.jmx_port = jmx_port;
	}

	public InetAddress getListen_address() {
		return listen_address;
	}

	public void setListen_address(InetAddress listen_address) {
		this.listen_address = listen_address;
	}

	public String getNative_protocol_version() {
		return native_protocol_version;
	}

	public void setNative_protocol_version(String native_protocol_version) {
		this.native_protocol_version = native_protocol_version;
	}

	public InetAddress getNative_transport_address() {
		return native_transport_address;
	}

	public void setNative_transport_address(InetAddress native_transport_address) {
		this.native_transport_address = native_transport_address;
	}

	public int getNative_transport_port() {
		return native_transport_port;
	}

	public void setNative_transport_port(int native_transport_port) {
		this.native_transport_port = native_transport_port;
	}

	public int getNative_transport_port_ssl() {
		return native_transport_port_ssl;
	}

	public void setNative_transport_port_ssl(int native_transport_port_ssl) {
		this.native_transport_port_ssl = native_transport_port_ssl;
	}

	public String getPartitioner() {
		return partitioner;
	}

	public void setPartitioner(String partitioner) {
		this.partitioner = partitioner;
	}

	public String getRack() {
		return rack;
	}

	public void setRack(String rack) {
		this.rack = rack;
	}

	public String getRelease_version() {
		return release_version;
	}

	public void setRelease_version(String release_version) {
		this.release_version = release_version;
	}

	public InetAddress getRpc_address() {
		return rpc_address;
	}

	public void setRpc_address(InetAddress rpc_address) {
		this.rpc_address = rpc_address;
	}

	public UUID getSchema_version() {
		return schema_version;
	}

	public void setSchema_version(UUID schema_version) {
		this.schema_version = schema_version;
	}

	public String getServer_id() {
		return server_id;
	}

	public void setServer_id(String server_id) {
		this.server_id = server_id;
	}

	public int getStorage_port() {
		return storage_port;
	}

	public void setStorage_port(int storage_port) {
		this.storage_port = storage_port;
	}

	public int getStorage_port_ssl() {
		return storage_port_ssl;
	}

	public void setStorage_port_ssl(int storage_port_ssl) {
		this.storage_port_ssl = storage_port_ssl;
	}

	public Set<String> getTokens() {
		return tokens;
	}

	public void setTokens(Set<String> tokens) {
		this.tokens = tokens;
	}

	public String getWorkload() {
		return workload;
	}

	public void setWorkload(String workload) {
		this.workload = workload;
	}

	public Set<String> getWorkloads() {
		return workloads;
	}

	public void setWorkloads(Set<String> workloads) {
		this.workloads = workloads;
	}

	@Override
	public String toString() {
		return "ClusterInfo [key=" + key + ", bootstrapped=" + bootstrapped + ", broadcast_address=" + broadcast_address
				+ ", cluster_name=" + cluster_name + ", cql_version=" + cql_version + ", data_center=" + data_center
				+ ", dse_version=" + dse_version + ", gossip_generation=" + gossip_generation + ", graph=" + graph
				+ ", host_id=" + host_id + ", jmx_port=" + jmx_port + ", listen_address=" + listen_address
				+ ", native_protocol_version=" + native_protocol_version + ", native_transport_address="
				+ native_transport_address + ", native_transport_port=" + native_transport_port
				+ ", native_transport_port_ssl=" + native_transport_port_ssl + ", partitioner=" + partitioner
				+ ", rack=" + rack + ", release_version=" + release_version + ", rpc_address=" + rpc_address
				+ ", schema_version=" + schema_version + ", server_id=" + server_id + ", storage_port=" + storage_port
				+ ", storage_port_ssl=" + storage_port_ssl + ", tokens=" + tokens + ", workload=" + workload
				+ ", workloads=" + workloads + "]";
	}
    
    

}
