package com.jiawa.wiki.controller;

import com.jiawa.wiki.po.Ebook;
import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.service.EBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuu
 **/
@RequestMapping("/ebook")
@RestController
public class EbookController {
    @Resource
    private EBookService ebookService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Ebook>> commonResp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        commonResp.setContent(list);
        return commonResp;
    }
}
