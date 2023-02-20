package com.autoparts.partservice.repository;

import com.autoparts.partservice.dao.ModelDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ModelRepository extends CrudRepository<ModelDAO, Long> {
    List<ModelDAO> findByTitleContainsIgnoreCase(String title);
}
