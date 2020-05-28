package com.yout.cloud.service;

/**
 * @author yout
 * @date 2020/5/27
 */
public interface ProductService {

    /**
     * 减少某个商品的库存
     *
     * @param productId
     * @param num
     */
    void reduceInventory(long productId, int num);
}
