package com.caoyang.common.controller;

import com.caoyang.bean.Music;
import com.caoyang.bean.Sleepsz;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "睡眠模式",description = "睡眠模式相关操作")
public class MyController {

    @ResponseBody
    @RequestMapping(value ="/sleep/findbysid", method = RequestMethod.GET)
    @ApiOperation(value = "主键查询音乐种类",notes = "test: ")
    @ApiImplicitParam(paramType = "query", name = "sid", value = "睡眠显示的音乐编号", required = true, dataType = "int")
    public Music findbysid(@RequestParam Integer sid){
        Music music= new Music();
        music.setSceneid(1);
        music.setImgurl("/sleep/images/leiyu.jpg");
        music.setMusicurl("/sleep/music/leiyu.mp3");
        music.setScenename("雷雨");
        music.setStat(1);
        return  music;
    }

    @ResponseBody
    @RequestMapping(value = "/sleep/findall",method = RequestMethod.GET)
    @ApiOperation(value = "查询所有音乐种类",notes = "test: ")
    public List findall(){
        List<Music> mlist=new ArrayList<Music>();
        for (int i=0;i<3;i++){
            Music music=new Music(i,"名字"+i,"musicurl"+i,"imgurl"+i,1);
            mlist.add(music);
        }
        return  mlist;
    }

    @ResponseBody
    @RequestMapping(value = "/sleep/beginsleep",method = RequestMethod.POST)
    @ApiOperation(value = "开始睡眠任务",notes = "test: ")
    public Sleepsz beginsleep(@RequestBody Sleepsz sleepsz){

         return sleepsz;
    }

   /*@GetMapping("/sleep/findbysid")
   @ApiOperation(value = "主键查询音乐种类",httpMethod = "GET",produces = MediaType.APPLICATION_JSON_VALUE)
    public String findall(@ApiParam(name ="userId",value = "用户编号",defaultValue = "101")int sid){
        System.out.println(111);
        return  "hello swagger!!!";
    }*/
}
