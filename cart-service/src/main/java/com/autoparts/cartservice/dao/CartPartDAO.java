package com.autoparts.cartservice.dao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cart_part")
public class CartPartDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cart_id")
    private Long cartId;

    @Column(name = "part_id")
    private Long partId;

    private Integer number;
}
