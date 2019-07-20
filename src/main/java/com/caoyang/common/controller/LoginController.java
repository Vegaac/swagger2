package com.caoyang.common.controller;


import com.caoyang.dto.GetAll;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 一个用来测试swagger注解的控制器
 * 注意@ApiImplicitParam的使用会影响程序运行，如果使用不当可能造成控制器收不到消息
 *
 * @author SUNF
 */

@Controller
@RequestMapping("/say")
@Api(value = "登陆",description = "登陆控制器")
public class LoginController {

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登陆", notes = "测试账户:admin,admin")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "username", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "password", value = "密码", required = true, dataType = "String")
    })
    public GetAll updatePassword(@RequestParam(value = "username") String username,
                                 @RequestParam(value = "password") String password) {
        GetAll getAll = null;
        if (username.equals("admin")){
            if (password.equals("admin")){
                getAll = new GetAll();
                getAll.setMsg("登录成功");
                getAll.setData("cookie");
                return getAll;
            }else {
                getAll = new GetAll();
                getAll.setMsg("密码错误");
                return getAll;
            }
        }else {
            getAll = new GetAll();
            getAll.setMsg("用户名不存在");
            return getAll;
        }


    }

}
