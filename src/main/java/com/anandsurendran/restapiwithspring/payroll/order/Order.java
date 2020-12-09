package com.anandsurendran.restapiwithspring.payroll.order;

import lombok.*;
import com.anandsurendran.restapiwithspring.payroll.Status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDER") @NoArgsConstructor @ToString @EqualsAndHashCode
public class Order {
    @Getter @Setter
    private @Id @GeneratedValue Long id;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private Status status;

    public Order(String description, Status status) {
        this.description = description;
        this.status = status;
    }
}
