package com.qys.controller;

import com.qys.pojo.Dept;
import com.qys.pojo.Result;
import com.qys.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    //查询部门
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> depList = deptService.list();
        return Result.success(depList);
    }

    //删除部门
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        deptService.delete(id);
        return Result.success();
    }

    //新增部门
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门："+dept);
        deptService.add(dept);
        return Result.success();
    }
}
