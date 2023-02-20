package com.autoparts.partservice.repository;

import com.autoparts.partservice.dao.PartDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PartRepository extends CrudRepository<PartDAO, Long> {
    List<PartDAO> findByModel_Id(Long id);
}
