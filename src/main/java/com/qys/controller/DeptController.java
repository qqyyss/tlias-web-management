package com.qys.controller;

import com.qys.pojo.Dept;
import com.qys.pojo.Result;
import com.qys.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> depList = deptService.list();
        return Result.success(depList);
    }
}
