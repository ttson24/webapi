package com.project.webservice.webapi.service.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.project.webservice.webapi.dto.user.UserDto;
import com.project.webservice.webapi.model.User;
import com.project.webservice.webapi.repositories.user.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository usrRepo;

    public List<UserDto> findAllUser(){
        List<UserDto> lstDto = new ArrayList<>();
        List<User> lstUser = usrRepo.findAll();
        if(null !=lstUser){
            lstUser.forEach(usr->{
                UserDto dto = new UserDto();
                BeanUtils.copyProperties(usr, dto);
                lstDto.add(dto);
            });
        }
        return lstDto;
    }

    @Override
    public void insertUser(UserDto dto) {
        User user = new User();
        BeanUtils.copyProperties(dto, user);
        usrRepo.save(user);
    }

    @Transactional
    @Override
    public void saveAll(List<UserDto> lstUser) {

        List<User> lstUserModel = new ArrayList<>();
        if(null != lstUser && lstUser.size()>0){
            lstUser.forEach(usrDto->{
                User usr = new User();
                BeanUtils.copyProperties(usrDto, usr);
                lstUserModel.add(usr);
            });
            usrRepo.saveAll(lstUserModel);
        }
    }

    @Transactional
    @Override
    public void save(UserDto dto) {
        User usr = new User();
        BeanUtils.copyProperties(dto, usr);
        usrRepo.save(usr);
    }
}
