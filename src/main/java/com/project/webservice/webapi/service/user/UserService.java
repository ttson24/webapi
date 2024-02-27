package com.project.webservice.webapi.service.user;

import java.util.List;
import com.project.webservice.webapi.dto.user.UserDto;

public interface UserService {
    public List<UserDto> findAllUser();

    public void insertUser(UserDto dto);
    public void save(UserDto dto);
    public void saveAll(List<UserDto> lstUser);
}
