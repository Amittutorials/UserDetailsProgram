package com.Logindetails.SpringbootLogin.Service;

import com.Logindetails.SpringbootLogin.Reposatory.LoginRepository;
import com.Logindetails.SpringbootLogin.Dto.LoginDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;
    public List<LoginDetailsDto> getLoginDetails(){
        List<LoginDetailsDto> ldd= loginRepository.getLoginDetails();
        return ldd;

    }

}
