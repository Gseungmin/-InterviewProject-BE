package project.interview.dto;

import lombok.Getter;
import project.interview.domain.order.Order;

@Getter
public class OrderReserveDto {

    private String username;
    private String orderDate;

    public OrderReserveDto(Order order) {
        this.username = order.getUsername();
        this.orderDate = order.getOrderDate();
    }
}
