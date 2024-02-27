package com.project.webservice.webapi.ctr.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.project.webservice.webapi.common.Common;
import com.project.webservice.webapi.common.MyUtil;
import com.project.webservice.webapi.dto.user.UserDto;
import com.project.webservice.webapi.service.user.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1")
@PropertySource(value = {"classpath:configration.properties"})
public class UserController {

    @Autowired
    private UserService usrService;

    @Value("${USER_DUMMY}")
    private String userDummy;

    @RequestMapping("/dummy-user")
    @ResponseStatus(HttpStatus.CREATED)
    public String dummyUser() throws Exception{
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
        List<UserDto> lstDto = new ArrayList<>();

        MyUtil util = new MyUtil();
        List<String[]> allData = util.readAllLines(userDummy);
        for (String[] row : allData) { 
            UserDto dto = new UserDto();
            dto.setId(Common.MY_UUID);
            dto.setUsername(row[0]);
            dto.setPassword(encoder.encode(row[1]));
            dto.setFirstName(row[2]);
            dto.setLastName(row[3]);
            dto.setEmail(row[4]);
            dto.setPostCode(row[5]);
            dto.setAddress(row[6]);
            dto.setTel(row[7]);
            dto.setFax(row[8]);
            dto.setMobile(row[9]);
            dto.setActive(row[10]);
            dto.setActiveCode(row[11]);
            dto.setActiveTime(row[12]);
            dto.setRoleId(row[13]);
            lstDto.add(dto);
        } 
        usrService.saveAll(lstDto);
        return "成功に登録された。";
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> findAll(){
        return usrService.findAllUser();
    }

    @PostMapping("/user")
    public String save(@Valid @RequestBody UserDto dto){
        usrService.save(dto);
        return "成功に登録された。";
    }
}
