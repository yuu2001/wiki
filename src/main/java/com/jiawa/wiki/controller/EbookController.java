package com.jiawa.wiki.controller;

import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.service.EBookService;
import com.jiawa.wiki.vo.resp.EBookRespVo;
import com.jiawa.wiki.vo.req.EBookVo;
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
    public CommonResp list( EBookVo ebookVO) {
        CommonResp<List<EBookRespVo>> commonResp = new CommonResp<>();
        List<EBookRespVo> list = ebookService.list(ebookVO);
        commonResp.setContent(list);
        return commonResp;
    }
}
