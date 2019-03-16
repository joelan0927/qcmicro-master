package com.qc.micro.controller;

import com.qc.micro.api.DeptServiceRemote;
import com.qc.micro.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 蓝少宾
 * @create 2019-03-15 23:35
 */
@RestController
public class DeptController {
    @Autowired
    private DeptServiceRemote deptService;

    @RequestMapping(value = "/consumer/dept/add/dept",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept getDeptById(@PathVariable("id") Long id){
        return deptService.getDeptById(id);
    }

    @RequestMapping(value = "/consumer/dept/get/all",method = RequestMethod.GET)
    public List<Dept> getAll(){
        return deptService.getAll();
    }
}
