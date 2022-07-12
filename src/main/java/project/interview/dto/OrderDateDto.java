package project.interview.dto;

import lombok.Getter;
import project.interview.domain.order.Order;

@Getter
public class OrderDateDto {

    private String orderDate;

    public OrderDateDto(Order order) {
        this.orderDate = order.getOrderDate();
    }
}
