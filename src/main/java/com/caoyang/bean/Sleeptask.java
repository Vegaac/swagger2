package com.caoyang.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
//夏晨萌
@ApiModel(value = "睡眠模式完成的任务",description = "任务表")
public class Sleeptask implements Serializable {
    @ApiModelProperty(name = "taskid",value = "任务id")
    private Integer taskid;
    @ApiModelProperty(name = "szid",value = "外键设置id")
    private Integer szid;
    @ApiModelProperty(name = "date",value = "任务完成的时间yyyy-mm-dd")
    private Date date;
    @ApiModelProperty(name = "begindata",value = "任务开始的时间yyyy/mm/dd/hh/mm/ss")
    private Date begindata;
    @ApiModelProperty(name = "enddata",value = "任务结束的时间yyyy/mm/dd/hh/mm/ss")
    private Date enddata;
    @ApiModelProperty(name = "zhilian",value = "本次睡眠任务的质量")
    private Double zhilian;

}
