package com.project.webservice.webapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "mst_discounts")
public class Discount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Double disValue;
    private String disDecsription;
    
}
