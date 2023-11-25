package javabetest.javabespring.model;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class OrderDetailId implements Serializable {

    @Column(name = "order_no")
    private String orderNo;
    @Column(name = "item_id")
    private Integer itemId;
}
