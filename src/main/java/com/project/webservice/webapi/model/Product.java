package com.project.webservice.webapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "data_products")
@EqualsAndHashCode(callSuper = true)
public class Product extends BaseModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String title;
    private String description;
    private String image;
    private Double price;
    private String discountId;
    private String taxId;
    private Long stock;
}
