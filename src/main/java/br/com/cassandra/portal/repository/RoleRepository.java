package br.com.cassandra.portal.repository;


import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;


import br.com.cassandra.portal.model.Role;

public interface RoleRepository extends CassandraRepository<Role, String>{

	@Query("SELECT * FROM system_auth.roles;")
	public List<Role> findAllRoles();
//@Query("SELECT new br.com.rodrism.projeto.dto.Contadores(t.status, count(t.status)) FROM Transacao t WHERE agente.id=:id GROUP BY status")

}
