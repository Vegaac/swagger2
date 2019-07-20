package com.caoyang.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
//夏晨萌
@ApiModel(value = "场景实体类",description = "对应潮汐的场景表")
public class Music implements Serializable {
    @ApiModelProperty(name = "sceneid",value = "场景编号")
    private Integer sceneid;
    @ApiModelProperty(name = "scenename",value = "场景名称")
    private String scenename;
    @ApiModelProperty(name = "musicurl",value = "音乐地址")
    private String musicurl;
    @ApiModelProperty(name = "imgurl",value = "图片地址")
    private String imgurl;
    @ApiModelProperty(name = "stat",value = "场景状态，1正常 2异常")
    private Integer stat;


    public Music() {
    }

    public Music(Integer sceneid, String scenename, String musicurl, String imgurl, Integer stat) {
        this.sceneid = sceneid;
        this.scenename = scenename;
        this.musicurl = musicurl;
        this.imgurl = imgurl;
        this.stat = stat;
    }

    public Integer getSceneid() {
        return sceneid;
    }

    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

    public String getScenename() {
        return scenename;
    }

    public void setScenename(String scenename) {
        this.scenename = scenename;
    }

    public String getMusicurl() {
        return musicurl;
    }

    public void setMusicurl(String musicurl) {
        this.musicurl = musicurl;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }
}
