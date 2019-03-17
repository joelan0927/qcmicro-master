package com.qc.micro.controller;

import com.github.pagehelper.PageInfo;
import com.qc.micro.entity.Dept;
import com.qc.micro.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 蓝少宾
 * @create 2019-03-15 21:46
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add/dept",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept){
        if (dept == null){
            throw new RuntimeException("参数非法，不能为空");
        }
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept getDeptById(@PathVariable("id") Long id){
        Dept dept = deptService.getDeptById(id);
        if (dept == null){
            throw new RuntimeException("无对应ID:"+id+"的相关信息");
        }
        return dept;
    }

    @RequestMapping(value = "/dept/get/all",method = RequestMethod.GET)
    public List<Dept> getAll(){

        return deptService.getAll();
    }

    @GetMapping(value = "/dept/get/list/For/page")
    public PageInfo<Dept> getListForPage(@RequestParam("pageNo")int pageNo){
        PageInfo<Dept> depts = deptService.getListForPage(pageNo);
        return depts;
    }
}
