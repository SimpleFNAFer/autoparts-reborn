package com.autoparts.cartservice.repository;

import com.autoparts.cartservice.dao.CartPartDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartPartRepository extends CrudRepository<CartPartDAO, Long> {
    List<CartPartDAO> findByCartId(Long cartId);
}
