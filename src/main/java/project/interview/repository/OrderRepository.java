package project.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.interview.domain.order.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
