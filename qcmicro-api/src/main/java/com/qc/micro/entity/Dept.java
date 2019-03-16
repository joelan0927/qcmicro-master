package com.qc.micro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 蓝少宾
 * @create 2019-03-15 18:01
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {
    private Long deptno;
    private String dname;
    private String db_source;
}
