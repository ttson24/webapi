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
@Table(name = "mst_users", schema = "manager")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String postCode;
    private String address;
    private String tel;
    private String fax;
    private String mobile;
    private String active;
    private String activeCode;
    private String activeTime;
    private String roleId;
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + ", postCode=" + postCode + ", address=" + address
                + ", tel=" + tel + ", fax=" + fax + ", mobile=" + mobile + ", active=" + active + ", activeCode="
                + activeCode + ", activeTime=" + activeTime + ", roleId=" + roleId + "]";
    }
    
}
