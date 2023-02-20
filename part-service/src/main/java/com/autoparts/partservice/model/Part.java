package com.autoparts.partservice.model;

import com.autoparts.partservice.dao.PartDAO;
import lombok.Data;

import java.util.Set;

@Data
public class Part {
    private String type;
    private String model;
    private String supplier;
    private float price;

    public Part(String type, String model, String supplier, float price) {
        this.type = type;
        this.model = model;
        this.supplier = supplier;
        this.price = price;
    }
}
