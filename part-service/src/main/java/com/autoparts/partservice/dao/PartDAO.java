package com.autoparts.partservice.dao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "part")
public class PartDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private TypeDAO type;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private ModelDAO model;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private SupplierDAO supplier;
    private float price;
}
