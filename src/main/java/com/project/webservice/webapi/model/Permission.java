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
@Table(name = "mst_permissions")
@EqualsAndHashCode(callSuper=true)
public class Permission extends BaseModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String permissionName; 
}
