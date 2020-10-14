package com.example.demo.controller;

import com.example.demo.async.AsyncInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Api(tags = "这是一个主控制类")
public class TestController {
    @Autowired
    AsyncInterface anInterface;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ApiOperation(value = "测试方法index")
    public String test(){
        System.out.println("11111");
        anInterface.testAsync();
        System.out.println("222222");
        return "index.html";
    }


    @ApiOperation(httpMethod = "POST",position = 2,value = "Test2Model测试数组参数，多个",response=String.class)
    @ApiResponses({
    @ApiResponse(code = 200, message = "非HTTP状态码，返回值JSON code字段值，描述：成功") })
    @ApiImplicitParams({
    @ApiImplicitParam(
        name = "ids",paramType ="form",value = "参数" ,required = true),
    @ApiImplicitParam(
            name = "id2",paramType ="json",value = "参数", required = true)
    })
    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String test2(){
        return null;
    }
}
