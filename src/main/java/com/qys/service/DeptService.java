package com.qys.service;

import com.qys.pojo.Dept;
import com.qys.pojo.Result;

import java.util.List;

public interface DeptService {
    //查询全部部门数据
    List<Dept> list();
}
