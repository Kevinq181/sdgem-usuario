package com.kjquito.usuario.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kjquito.usuario.models.ERole;
import com.kjquito.usuario.models.Role;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long>  {
	Optional<Role> findByName(ERole name);
}
