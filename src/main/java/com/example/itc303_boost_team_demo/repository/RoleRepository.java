package com.example.itc303_boost_team_demo.repository;

import com.example.itc303_boost_team_demo.model.Role;
import com.example.itc303_boost_team_demo.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}