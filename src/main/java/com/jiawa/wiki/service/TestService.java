package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.TestMapper;
import com.jiawa.wiki.po.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuu
 **/
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }

}
