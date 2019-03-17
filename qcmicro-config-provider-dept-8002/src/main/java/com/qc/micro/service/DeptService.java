package com.qc.micro.service;

import com.github.pagehelper.PageInfo;
import com.qc.micro.entity.Dept;

import java.util.List;

/**
 * @author 蓝少宾
 * @create 2019-03-15 21:40
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept getDeptById(Long id);

    public List<Dept> getAll();

    PageInfo<Dept> getListForPage(int pageNo);
}
