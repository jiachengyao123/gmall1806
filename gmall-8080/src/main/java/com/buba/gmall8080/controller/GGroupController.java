package com.buba.gmall8080.controller;


import com.buba.gmall8080.pojo.GGroup;
import com.buba.gmall8080.service.GGroupService;
import com.buba.gmall8080.utils.Result;
import com.buba.gmall8080.utils.StatusCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MrJia
 * @since 2020-04-10
 */
@CrossOrigin //跨域注解
@RestController
@RequestMapping("/gGroup")
public class GGroupController {

    @Resource
    private GGroupService gGroupService;

    @GetMapping("")
    public Result getTets(){

        List<GGroup> list = gGroupService.list();

        return  new Result(true,StatusCode.OK,"查询成功",list);

    }

}

