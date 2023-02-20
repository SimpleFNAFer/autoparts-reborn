package com.autoparts.partservice.dao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "`replace`")
public class ReplaceDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "origin_id")
    private long originId;
    @Column(name = "replace_id")
    private long replaceId;
}
