package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.po.Ebook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuu
 **/
@Service
public class EBookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
