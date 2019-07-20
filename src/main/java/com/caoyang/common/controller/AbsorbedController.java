package com.caoyang.common.controller;
//怡
import com.caoyang.bean.UserInformation;
import com.caoyang.bean.MusicOptions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/Absorbed")
@Api(value = "处理专注模块相关请求")
public class AbsorbedController {

    @ResponseBody
    @RequestMapping(value = "/getAllMusic",method = RequestMethod.GET)
    @ApiOperation(value="(专注.html页面数据)首页点击专注获取所有音乐信息")
    public List<MusicOptions> getAllMusic(HttpSession session, HttpServletResponse response){
       List list=new ArrayList();
        MusicOptions m1=new MusicOptions();
        MusicOptions m2=new MusicOptions();
        m1.setId(1);
        m1.setTitle("雷雨");
        m1.setUrl("/music/123456");
        m2.setId(2);
        m2.setTitle("雨天");
        m2.setUrl("/music/111111");
        list.add(m1);
        list.add(m2);
        session.setAttribute("music",list);
        return list;
       /* PrintWriter writer = null;
        try {
            response.setContentType("text/html;charset=utf-8");
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.print("<script> location.href='/专注.html'</script>");*/
    }

    @ResponseBody
    @RequestMapping(value = "/updateInfo",method = RequestMethod.POST)
    @ApiOperation(value="（完成专注修改数据库）点击开始专注 获取系统开始时间自动倒计时，设置时间(分钟)，倒计时为0时系统时间 ,倒计时为0后自动发起请求")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "startTime", value = "系统开始时间", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "stopTime", value = "倒计时为0时系统时间", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "szTime", value = "设置时间", required = true, dataType = "String")
    })
    public void getTime(int userId,String startTime,String stopTime,String szTime) {
        List list=new ArrayList();
        //效率
        double xl=0.66;
        //专注次数加1
        int cs=10;
        //专注时长=+设置时间(分钟)
        int t=60;
        list.add(xl);
        list.add(cs);
        list.add(t);

    }

    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="（专注记录.html数据）点击‘今日专注’,根据用户id获取用户专注信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer")

    })
    public List<UserInformation> getMore(int userId, ModelMap modelMap) {
        List<UserInformation> list=new ArrayList<>();
        UserInformation user=new UserInformation();
       /* //今日专注时长
        user.setDayTime(50);
        //今日专注次数
        user.setNumber(5);
        //专心程度
        user.setLevel(0.66);
        //今日专注最佳效率开始时间
        Date startTime=new Date();
        user.setStartTime(startTime);
        modelMap.addAttribute("user",user);
        list.add(user);*/
        return list;
    }


}
