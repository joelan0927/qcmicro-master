package com.qc.micro.fallback;

import com.qc.micro.api.DeptServiceRemote;
import com.qc.micro.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 蓝少宾
 * @create 2019-03-15 22:08
 */
@Component
public class DeptServiceFallbackFactory implements FallbackFactory<DeptServiceRemote> {
    @Override
    public DeptServiceRemote create(Throwable cause) {
        return new DeptServiceRemote() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept getDeptById(Long id) {
                return new Dept().setDeptno(id).setDname("未能查询到对应数据，进行服务降级").setDb_source("no database provider");
            }

            @Override
            public List<Dept> getAll() {
                List<Dept> list = new ArrayList<>();
                Dept dept = new Dept().setDeptno(null).setDname("未能查询到对应数据，进行服务降级").setDb_source("no database provider");
                list.add(dept);
                return list;
            }
        };
    }
}
