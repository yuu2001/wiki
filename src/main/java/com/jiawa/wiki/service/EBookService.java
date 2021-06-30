package com.jiawa.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.po.Ebook;
import com.jiawa.wiki.po.EbookExample;
import com.jiawa.wiki.util.CopyUtil;
import com.jiawa.wiki.vo.req.EBookVo;
import com.jiawa.wiki.vo.resp.EBookRespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuu
 **/
@Service
@Slf4j
public class EBookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EBookRespVo> list(EBookVo req){
        EbookExample ebookExample = new EbookExample();
        if (!ObjectUtils.isEmpty(req.getName())){
            ebookExample.createCriteria().andNameLike("%"+req.getName()+"%");
        }
        PageHelper.startPage(1,3);
        List<Ebook> ebooks = ebookMapper.selectByExample(ebookExample);
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebooks);
        log.info("total :"+pageInfo.getTotal());
        log.info("pages :"+pageInfo.getPages());
        /*ArrayList<EBookRespVo> resplist = new ArrayList<>();
        for (Ebook ebook : ebooks) {
            EBookRespVo respVo = new EBookRespVo();
            BeanUtils.copyProperties(ebook, respVo);
            //对象复制
            EBookRespVo respVo = CopyUtil.copy(ebook, EBookRespVo.class);
            resplist.add(respVo);
        }*/
        //列表复制
        List<EBookRespVo> respList = CopyUtil.copyList(ebooks, EBookRespVo.class);
        return respList;
    }
}
