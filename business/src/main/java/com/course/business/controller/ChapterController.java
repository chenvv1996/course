package com.course.business.controller;

import com.course.business.domain.Chapter;
import com.course.business.service.IChapterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * description: 大章表
 * author: chenyj
 *
 * @date: 2024/3/28
 */
@RestController
@RequestMapping("/chapter")
@Api(tags = "大章表")
public class ChapterController {

    @Resource
    private IChapterService chapterService;

    //@ApiOperation(value = "test1接口",notes = "test1接口详细描述")
    @ApiOperation(value = "大章列表-接口",notes = "test1接口详细描述")
    @GetMapping("/listChapter")
    public List<Chapter> listChapter() {
        return chapterService.listChapter();
    }
}
