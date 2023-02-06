package com.thimodule4.service;


import com.thimodule4.model.Account;
import com.thimodule4.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    IAccountRepo iAccountRepo;
    public Account checkLogin(String username, String password){
        return iAccountRepo.checkLogin(username,password);
    }
}
