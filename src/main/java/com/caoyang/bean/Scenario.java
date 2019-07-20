package com.caoyang.bean;

public class Scenario {

    private Integer sceneid;

    private String scenename;

    private String musicurl;

    private String imgurl;

    private Integer stat;

    public Scenario() {
    }

    public Scenario(Integer sceneid, String scenename, String musicurl, String imgurl, Integer stat) {

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

    @Override
    public String toString() {
        return "Scenario{" +
                "sceneid=" + sceneid +
                ", scenename='" + scenename + '\'' +
                ", musicurl='" + musicurl + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", stat=" + stat +
                '}';
    }
}
