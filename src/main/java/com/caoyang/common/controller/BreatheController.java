package com.caoyang.common.controller;

import com.caoyang.bean.Scenario;
import com.caoyang.bean.Users;
import com.caoyang.dto.GetAll;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/breathe")
@Api(value = "Breathe|呼吸模块控制器")
public class BreatheController {

    @ResponseBody
    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    @ApiOperation(value = "查询音乐场景列表", notes = "测试参数为:18eu2jwk2kse3r42e2e;此处为匿名地址当参数为空也可返回参数")
    @ApiImplicitParam(paramType = "query", name = "openid", value = "微信openid", required = true, dataType = "String")
    public GetAll getAll(@RequestParam String openid) {
        GetAll getAll = null;
        List<Scenario> scenarioList = new ArrayList<>();
        if (openid.equals("18eu2jwk2kse3r42e2e")||openid==null){

            Users users = new Users();
            users.setUid(519);
            users.setUname("谭嗣同");
            users.setOpenid("18eu2jwk2kse3r42e2e");
            users.setFeteday(new Date());
            users.setPhone("13913913913");
            users.setGender(1);
            users.setEmail("c@ione.cc");
            users.setHeadurl("/opt/img/2019051157384.png");
            users.setStat(1);


            for (int i = 0; i <4 ; i++) {
                Scenario scenario = new Scenario();
                scenario.setSceneid(i);
                scenario.setScenename("场景"+(i+1));
                scenario.setMusicurl("/opt/music/2019051157384"+i+".mp3");
                scenario.setImgurl("/opt/img/2019051157384"+i+".png");
                scenario.setStat(1);
                scenarioList.add(scenario);
            }
            //list.add(users);
            //list.add(scenarioList);
            getAll = new GetAll(1,"查询成功",scenarioList,users);
            return getAll;
        }else {
            getAll = new GetAll(1,"查询失败",null,null);
            return getAll;
        }

    }

    @ResponseBody
    @RequestMapping(value = "/startbreathe",method = RequestMethod.POST)
    @ApiOperation(value = "开始呼吸", notes = "点击开始呼吸")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "breathetype", value = "呼吸类型默认参数1", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "breatheratesa", value = "每分钟呼吸次数A默认参数7", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "breatheratesb", value = "每分钟呼吸次数B默认参数4", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "breathetimes", value = "呼吸时间默认参数15", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "breatheguide", value = "声音引导默认参数0关闭", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "breatheshake", value = "触感提示默认参数0关闭", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "sceneid", value = "自然声音默认山泉参数为sceneid=1", required = true, dataType = "int")
    })
    public String startbreathe(@RequestParam(value = "breathetype") Integer breathetype,
                               @RequestParam(value = "breatheratesa") Integer breatheratesa,
                               @RequestParam(value = "breatheratesb") Integer breatheratesb,
                               @RequestParam(value = "breathetimes") Integer breathetimes,
                               @RequestParam(value = "breatheguide") Integer breatheguide,
                               @RequestParam(value = "breatheshake") Integer breatheshake,
                               @RequestParam(value = "sceneid") Integer sceneid) {

        return "开始成功";
    }

    @ResponseBody
    @RequestMapping(value = "/breathestop",method = RequestMethod.POST)
    @ApiOperation(value = "停止呼吸", notes = "点击停止")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "uid", value = "用户ID", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "runtime", value = "已呼吸时间单位为秒", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "breathetimes", value = "总呼吸时间单位为秒", required = true, dataType = "int")
    })
    public String updatePassword(@RequestParam(value = "uid") Integer uid, @RequestParam(value = "runtime") Integer runtime,
                                 @RequestParam(value = "breathetimes") Integer breathetimes) {

        return "停止成功";
    }


}
