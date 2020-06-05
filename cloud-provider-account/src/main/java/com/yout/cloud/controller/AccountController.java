package com.yout.cloud.controller;

import com.yout.cloud.mapper.AccountMapper;
import com.yout.cloud.pojo.AccountDomain;
import com.yout.cloud.pojo.CommonResult;
import com.yout.cloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yout
 * @date 2020/5/28
 */
@RestController
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account/info/{id}")
    public CommonResult<AccountDomain> getAccountById(@PathVariable Long id) {
        CommonResult<AccountDomain> account = new CommonResult<>();
        try {
            account.setMessage("query success.");
            account.setResult(accountService.getAccountById(id));
            account.setStatus(200);
        } catch (Exception e) {
            log.error("getAccountById error.", e);
            account.setMessage("query error." + e.getMessage());
            account.setStatus(500);
        }
        return account;
    }
}
