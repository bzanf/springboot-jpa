package org.project.springboot_jpa.repositories;

import org.project.springboot_jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
