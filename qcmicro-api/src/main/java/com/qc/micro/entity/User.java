package com.qc.micro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 蓝少宾
 * @create 2019-03-16 9:00
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String userName;
    private String password;
}
