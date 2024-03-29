package com.course.business.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * description: 大章表
 * author: chenyj
 *
 * @date: 2024/3/29
 */
@Data
@TableName("chapter")
public class Chapter {

    //@ApiModelProperty(value = "大章id", example = "00000001")
    @TableId
    private String id;

    //@ApiModelProperty(value = "课程id", example = "00000000")
    @TableField("courseId")
    private String courseId;

    //@ApiModelProperty(value = "大章名称", example = "测试大章01")
    @TableField("name")
    private String name;
}
