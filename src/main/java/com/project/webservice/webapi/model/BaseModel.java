package com.project.webservice.webapi.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseModel {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "created_at", updatable = false, nullable = false)
    private String createdAt;
    @Column(name = "updated_at")
    private String updatedAt;
    @Column(name = "deleted_at")
    private String deletedAt;

    @PrePersist
    protected void PrePersist(){
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        if (this.createdAt == null) {
            this.createdAt = formatter.format(currentTime);
        }
        if (this.updatedAt == null) {
            this.updatedAt = formatter.format(currentTime);
        }
        if (this.deletedAt == null && this.createdAt !=null) {
            this.deletedAt = formatter.format(currentTime);
        }
    }
    
    @PreUpdate
    protected void preUpdate(){
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        this.updatedAt = formatter.format(currentTime);
    }
    @PreRemove
    protected void preRemove(){
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        this.deletedAt = formatter.format(currentTime);
    }
}
