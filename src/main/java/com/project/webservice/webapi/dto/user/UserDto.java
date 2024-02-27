package com.project.webservice.webapi.dto.user;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {
    public UserDto(){}
    private String id;

    @NotBlank(message = "{validate.empty}")
    @Size(min = 4, max = 12, message = "{validate.min.max}")
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
        return "UserDto [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + ", postCode=" + postCode + ", address=" + address
                + ", tel=" + tel + ", fax=" + fax + ", mobile=" + mobile + ", active=" + active + ", activeCode="
                + activeCode + ", activeTime=" + activeTime + ", roleId=" + roleId + "]";
    }
    
}
