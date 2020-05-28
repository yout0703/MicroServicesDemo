package com.yout.cloud.service;

/**
 * @author yout
 * @date 2020/5/27
 */
public interface OrderService {

    /**
     * 买了几个什么产品
     *
     * @param productId
     * @param num
     */
    void order(long productId, int num);
}
