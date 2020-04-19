package com.amsidh.mvc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amsidh.mvc.dto.EnumRole;
import com.amsidh.mvc.dto.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(EnumRole name);
}
