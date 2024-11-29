package com.qys.service.impl;

import com.qys.mapper.DeptMapper;
import com.qys.pojo.Dept;
import com.qys.pojo.Result;
import com.qys.service.DeptService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServicelmpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        List<Dept> list = deptMapper.list();
        return list;
    }

    @Override
    public void delete(Integer id){
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept){
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.add(dept);
    }
}
