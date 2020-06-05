package com.yout.cloud.service;

import com.yout.cloud.pojo.AccountDomain;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yout
 * @date 2020/5/27
 */
public interface AccountService {

    /**
     * 扣款
     *
     * @param amount
     * @return
     */
    int deduct(double amount);

    /**
     * 通过ID获取账号详情
     * @param id
     * @return
     */
    AccountDomain getAccountById(long id);

}
