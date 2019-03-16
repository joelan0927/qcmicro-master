package com.qc.micro.api;

import com.qc.micro.entity.Dept;
import com.qc.micro.fallback.DeptServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author 蓝少宾
 * @create 2019-03-15 21:59
 */
@FeignClient(value = "qcmicro-config-provider-dept",fallbackFactory = DeptServiceFallbackFactory.class)
public interface DeptServiceRemote {

    @RequestMapping(value = "/dept/add/dept",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept);

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept getDeptById(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/get/all",method = RequestMethod.GET)
    public List<Dept> getAll();
}
