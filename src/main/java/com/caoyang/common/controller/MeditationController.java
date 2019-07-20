package com.caoyang.common.controller;


import com.caoyang.bean.Detailed;
import com.caoyang.bean.Scenario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/meditation")
@Api(value = "Meditation|冥想模块控制器")
public class MeditationController {

    @ResponseBody
    @RequestMapping(value = "/meditation/getState", method = RequestMethod.POST)
    @ApiOperation(value = "点击开始按钮开始冥想", notes = "返回参数为1（开始）或者2（暂停）")
    @ApiImplicitParam(paramType = "query", name = "State", value = "状态", required = true, dataType = "Integer")
    public String getState(@RequestParam Integer State) {
        if (State == 1) {
            return "开始";
        } else if (State == 2) {
            return "暂停";
        } else {
            return "未知错误";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/meditation/getPull", method = RequestMethod.POST)
    @ApiOperation(value = "上拉列表", notes = "返回参数为1（上拉显示）或者2（下拉关闭）")
    @ApiImplicitParam(paramType = "query", name = "pull", value = "上拉", required = true, dataType = "Integer")
    public String getDetailed(@RequestParam Integer pull) {
        if (pull == 1) {
            return "/detailed";
        } else if (pull == 2) {
            return "/meditation";
        } else {
            return "/meditation";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/meditation/getScenario", method = RequestMethod.GET)
    @ApiOperation(value = "获取场景id切换场景", notes = "返回Scenario")
    @ApiImplicitParam(paramType = "query", name = "scenarioid", value = "场景id", required = true, dataType = "Scenario")
    public Scenario getScenario(@RequestParam Integer scenarioid) {
        Scenario scen = new Scenario();
        if (scenarioid == 1) {
            scen.setSceneid(1);
            scen.setScenename("雨天");
            scen.setMusicurl("/opt/music/雨天.mp3");
            scen.setImgurl("/opt/img/雨天.png");
            return scen;
        } else if (scenarioid == 2) {
                scen.setSceneid(2);
                scen.setScenename("海洋");
                scen.setMusicurl("/opt/music/海洋.mp3");
                scen.setImgurl("/opt/img/海洋.png");
                return scen;
        } else if (scenarioid == 3) {
            scen.setSceneid(3);
            scen.setScenename("冥想");
            scen.setMusicurl("/opt/music/冥想.mp3");
            scen.setImgurl("/opt/img/冥想.png");
            return scen;
        } else if (scenarioid == 4) {
            scen.setSceneid(4);
            scen.setScenename("雷雨");
            scen.setMusicurl("/opt/music/雷雨.mp3");
            scen.setImgurl("/opt/img/雷雨.png");
            return scen;
        } else {
            return null;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/meditation/getOut", method = RequestMethod.POST)
    @ApiOperation(value = "退出冥想页面", notes = "返回参数为1")
    @ApiImplicitParam(paramType = "query", name = "out", value = "退出", required = true, dataType = "Integer")
    public String getOut(@RequestParam Integer out) {
        if (out == 1) {
            return "/index";
        } else {
            return "/meditation";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/meditation/getMore", method = RequestMethod.POST)
    @ApiOperation(value = "打开选项窗口", notes = "返回参数为1")
    @ApiImplicitParam(paramType = "query", name = "more", value = "更多", required = true, dataType = "Integer")
    public String getMore(@RequestParam Integer more) {
        if (more == 1) {
            return "/more";
        } else {
            return "/meditation";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/more/getRelax", method = RequestMethod.POST)
    @ApiOperation(value = "放松设置页面", notes = "返回参数为1")
    @ApiImplicitParam(paramType = "query", name = "relax", value = "放松", required = true, dataType = "Integer")
    public String getRelax(@RequestParam Integer relax) {
        if (relax == 1) {
            return "/relax";
        } else {
            return "/more";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/relax/getOff", method = RequestMethod.POST)
    @ApiOperation(value = "放松页面声音场景自动停止按钮", notes = "返回参数为1")
    @ApiImplicitParam(paramType = "query", name = "off", value = "开关", required = true, dataType = "Integer")
    public String getOff(@RequestParam Integer off) {
        if (off == 1) {
            return "开";
        } else {
            return "关";
        }
    }


    @ResponseBody
    @RequestMapping(value = "/more/getFeedback", method = RequestMethod.POST)
    @ApiOperation(value = "意见反馈页面", notes = "返回参数为1")
    @ApiImplicitParam(paramType = "query", name = "feedback", value = "意见反馈", required = true, dataType = "Integer")
    public String getFeedback(@RequestParam Integer feedback) {
        if (feedback == 1) {
            return "/feedback";
        } else {
            return "/more";
        }
    }


    @ResponseBody
    @RequestMapping(value = "/feedback/getSubmit", method = RequestMethod.POST)
    @ApiOperation(value = "填入反馈信息提交", notes = "返回参数为1")
    @ApiImplicitParam(paramType = "query", name = "submit", value = "提交意见", required = true, dataType = "Integer")
    public String getSubmit(@RequestParam Integer submit) {
        if (submit == 1) {
            return "提交成功";
        } else {
            return "提交失败";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/detailed", method = RequestMethod.GET)
    @ApiOperation(value = "显示所有详细内容", notes = "返回detailed对象")
    @ApiImplicitParam(paramType = "query", name = "did", value = "详细分类id", required = true, dataType = "Detailed")
    public Detailed findDname(@RequestParam Integer did) {
        Detailed detailed = new Detailed();
        if (did == 1) {
            detailed.setDid(1);
            detailed.setDname("等候");
            return detailed;
        } else if (did == 2) {
            detailed.setDid(2);
            detailed.setDname("轻冥想");
            return detailed;
        } else if (did == 3) {
                detailed.setDid(3);
                detailed.setDname("时刻");
                return detailed;
        } else if (did == 4) {
            detailed.setDid(4);
            detailed.setDname("谈冥想");
            return detailed;

        } else if (did == 5) {
            detailed.setDid(5);
            detailed.setDname("基础");
            return detailed;
        } else {
            return null;
        }
    }


}