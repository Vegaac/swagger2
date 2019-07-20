package com.caoyang.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Date;

//夏晨萌
@ApiModel(value = "睡眠模式简单设置",description = "睡眠模式功能表")
public class Sleepsz implements Serializable {
    @ApiModelProperty(name = "szid",value = "设置id")
    private Integer szid;
    @ApiModelProperty(name = "mid",value = "场景编号")
    private  Integer mid;
    @ApiModelProperty(name = "naostar",value = "闹钟的状态")
    private Integer naostar;
    @ApiModelProperty(name = "time",value = "播放音乐时长")
    private  Integer time;
    @ApiModelProperty(name = "scont",value = "今日睡眠次数")
    private Integer scont;
    @ApiModelProperty(name = "sdate",value = "睡眠提醒时间")
    private Date sdate;

    public Integer getSzid() {
        return szid;
    }

    public void setSzid(Integer szid) {
        this.szid = szid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getNaostar() {
        return naostar;
    }

    public void setNaostar(Integer naostar) {
        this.naostar = naostar;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getScont() {
        return scont;
    }

    public void setScont(Integer scont) {
        this.scont = scont;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }
}
