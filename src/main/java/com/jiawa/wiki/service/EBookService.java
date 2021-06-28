package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.po.Ebook;
import com.jiawa.wiki.po.EbookExample;
import com.jiawa.wiki.vo.req.EBookVo;
import com.jiawa.wiki.vo.resp.EBookRespVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuu
 **/
@Service
public class EBookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EBookRespVo> list(EBookVo req){
        EbookExample ebookExample = new EbookExample();
        ebookExample.createCriteria().andNameLike("%"+req.getName()+"%");
        List<Ebook> ebooks = ebookMapper.selectByExample(ebookExample);
        ArrayList<EBookRespVo> resplist = new ArrayList<>();
        for (Ebook ebook : ebooks) {
            EBookRespVo respVo = new EBookRespVo();
            BeanUtils.copyProperties(ebook, respVo);
            resplist.add(respVo);
        }
        return resplist;
    }
}
