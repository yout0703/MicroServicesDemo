package com.yout.cloud.service;

/**
 * @author yout
 * @date 2020/5/27
 */
public interface AccountService {

    /**
     * 扣款
     * @param amount
     * @return
     */
    int deduct(double amount);

}
