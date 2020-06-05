package com.yout.cloud.controller;

import com.yout.cloud.pojo.AccountDomain;
import com.yout.cloud.pojo.CommonResult;
import com.yout.cloud.service.RemoteAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yout
 * @date 2020/5/27
 */
@RestController
public class ConsumerWebController {

    @Autowired
    private RemoteAccountService remoteAccountService;

    @GetMapping("/order/{id}/{num}")
    public CommonResult<String> doOrder(@PathVariable Long id, @PathVariable int num) {

        return null;

    }

    @GetMapping("/account/info/{id}")
    public CommonResult<AccountDomain> getAccountById(@PathVariable Long id) {
        return remoteAccountService.getAccountById(id);
    }

}
