package com.yout.cloud.service;

import com.yout.cloud.pojo.AccountDomain;
import com.yout.cloud.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yout
 * @date 2020/5/28
 */

@Component
@FeignClient("cloud-provider-account")
public interface RemoteAccountService {

    @GetMapping("/account/info/{id}")
    CommonResult<AccountDomain> getAccountById(@PathVariable("id") Long id);
}
