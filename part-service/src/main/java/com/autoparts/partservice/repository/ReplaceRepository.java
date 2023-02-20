package com.autoparts.partservice.repository;

import com.autoparts.partservice.dao.ReplaceDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReplaceRepository extends CrudRepository<ReplaceDAO, Long> {
    List<ReplaceDAO> findByOriginId (Long id);
}
