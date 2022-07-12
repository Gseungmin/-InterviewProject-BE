package project.interview.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.interview.domain.order.Order;
import project.interview.dto.OrderDateDto;
import project.interview.dto.OrderReserveDto;
import project.interview.service.OrderService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final OrderService orderService;

    @GetMapping("/")
    public List<OrderDateDto> main() {
        List<OrderDateDto> result = orderService.findAll().stream().map(order -> new OrderDateDto(order)).collect(Collectors.toList());
        return result;
    }

    @PostMapping("/")
    public ResponseEntity<Order> reserve(@Valid @RequestBody Order order) {
        Order savedOrder = orderService.save(order);
        return new ResponseEntity<Order>(savedOrder, HttpStatus.CREATED);
    }

    @GetMapping("/orderPage")
    public List<OrderReserveDto> orders() {
        List<OrderReserveDto> result = orderService.findAll().stream().map(order -> new OrderReserveDto(order)).collect(Collectors.toList());
        return result;
    }
}
