package project.interview.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.interview.domain.order.Order;
import project.interview.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        return Optional.ofNullable(order.get());
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

}
