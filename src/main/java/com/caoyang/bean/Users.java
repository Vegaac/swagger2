package com.caoyang.bean;

import java.util.Date;

public class Users {

    private Integer uid;

    private String uname;

    private String openid;

    private Date feteday;

    private String phone;

    private Integer gender;

    private String email;

    private String headurl;

    private Integer stat;

    public Users() {
    }

    public Users(Integer uid, String uname, String openid, Date feteday, String phone, Integer gender, String email, String headurl, Integer stat) {

        this.uid = uid;
        this.uname = uname;
        this.openid = openid;
        this.feteday = feteday;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.headurl = headurl;
        this.stat = stat;
    }

    public Integer getUid() {

        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getFeteday() {
        return feteday;
    }

    public void setFeteday(Date feteday) {
        this.feteday = feteday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", openid='" + openid + '\'' +
                ", feteday=" + feteday +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", headurl='" + headurl + '\'' +
                ", stat=" + stat +
                '}';
    }
}
