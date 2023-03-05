package com.autoparts.cartservice.repository;

import com.autoparts.cartservice.dao.CartDAO;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartDAO, Long> {
}
