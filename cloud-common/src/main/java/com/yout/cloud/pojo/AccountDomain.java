package com.yout.cloud.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("account")
public class AccountDomain implements Serializable {

    private int id;
    private String accountCode;
    private String accountName;
    private double amount;//账户余额

}
