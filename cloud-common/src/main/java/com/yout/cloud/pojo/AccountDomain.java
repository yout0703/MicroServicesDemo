package com.yout.cloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yout
 * @date 2020/5/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDomain implements Serializable {

    private int id;
    private String name;
    private double balance;//账户余额

}
