package com.autoparts.partservice.dao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "type")
public class TypeDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
}
