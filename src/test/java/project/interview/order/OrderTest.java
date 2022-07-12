package project.interview.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import project.interview.domain.order.Order;
import project.interview.service.OrderService;

@SpringBootTest
@Transactional
@Commit
public class OrderTest {

    @Autowired
    OrderService orderService;

    @Test
    @DisplayName("Valid 테스트")
    void ValidTest() {
        Order order = new Order("지승민", "01090210816", "cswcsm02@gmail.com",
                 "7/12");
        Order savedOrder = orderService.save(order);
        Order findOrder = orderService.findById(savedOrder.getId()).get();
        Assertions.assertThat(savedOrder.getId()).isEqualTo(findOrder.getId());
    }

}
