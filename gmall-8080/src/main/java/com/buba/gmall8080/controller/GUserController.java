package com.buba.gmall8080.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.buba.gmall8080.pojo.GGroup;
import com.buba.gmall8080.pojo.GUser;
import com.buba.gmall8080.service.GUserService;
import com.buba.gmall8080.utils.Result;
import com.buba.gmall8080.utils.StatusCode;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MrJia
 * @since 2020-04-12
 */
@RestController
@CrossOrigin
@RequestMapping("/gUser")
public class GUserController {
    @Resource
    private GUserService gUserService;
    @GetMapping("/getLogin")
    public Result getLogin(@RequestBody GUser gUser){
        QueryWrapper<GUser>www= new QueryWrapper<>();//查询条件对象
        //参数赋值
        www.eq("userAccount",gUser.getUserAccount()).eq("userPasswd",gUser.getUserPasswd());
        GUser one = gUserService.getOne(www);
        return new Result(true, StatusCode.OK,"登陆成功",one);
    }

}

