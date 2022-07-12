package project.interview.domain.order;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Table(name = "ORDERS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @NotEmpty(message = "이름을 작성해주세요")
    private String username;

    @NotEmpty
    @Pattern(regexp = "^01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$", message = "전화번호 양식을 지켜주세요")
    private String phoneNumber;

    @NotEmpty(message = "메일을 작성해주세요")
    @Email(message = "메일의 양식을 지켜주세요")
    private String email;

    private String orderDate;

    public Order(String username, String phoneNumber, String email, String orderDate) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.orderDate = orderDate;
    }
}
