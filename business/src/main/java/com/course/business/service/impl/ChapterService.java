package com.course.business.service.impl;

import com.course.business.mapper.ChapterMapper;
import com.course.business.domain.Chapter;
import com.course.business.service.IChapterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterService implements IChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    @Override
    public List<Chapter> listChapter() {
        return chapterMapper.selectList(null);
    }
}
