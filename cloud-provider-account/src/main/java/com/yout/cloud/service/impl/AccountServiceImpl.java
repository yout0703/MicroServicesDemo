package com.yout.cloud.service.impl;

import com.yout.cloud.mapper.AccountMapper;
import com.yout.cloud.pojo.AccountDomain;
import com.yout.cloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yout
 * @date 2020/5/27
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int deduct(double amount) {
        return 0;
    }

    @Override
    public AccountDomain getAccountById(long id) {
        return accountMapper.selectById(id);
    }
}
