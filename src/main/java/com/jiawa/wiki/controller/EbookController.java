package com.jiawa.wiki.controller;

import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.service.EBookService;
import com.jiawa.wiki.vo.req.EBookSaveVo;
import com.jiawa.wiki.vo.req.EBookVo;
import com.jiawa.wiki.vo.resp.EBookRespVo;
import com.jiawa.wiki.vo.resp.PageRespVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yuu
 **/
@RequestMapping("/ebook")
@RestController
public class EbookController {
    @Resource
    private EBookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EBookVo ebookVO) {
        CommonResp<PageRespVo<EBookRespVo>> commonResp = new CommonResp<>();
        PageRespVo<EBookRespVo> list = ebookService.list(ebookVO);
        commonResp.setContent(list);
        return commonResp;
    }

    @PostMapping("/save")
    public CommonResp save(@RequestBody EBookSaveVo ebook){
        CommonResp<Object> commonResp = new CommonResp<>();
        ebookService.save(ebook);
        return commonResp;
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable Long id){
        CommonResp<Object> commonResp = new CommonResp<>();
        ebookService.delete(id);
        return commonResp;

    }
}
