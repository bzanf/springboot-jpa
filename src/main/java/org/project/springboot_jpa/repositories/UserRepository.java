package org.project.springboot_jpa.repositories;

import org.project.springboot_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
