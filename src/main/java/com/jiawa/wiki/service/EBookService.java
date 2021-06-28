package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.po.Ebook;
import com.jiawa.wiki.po.EbookExample;
import com.jiawa.wiki.util.CopyUtil;
import com.jiawa.wiki.vo.req.EBookVo;
import com.jiawa.wiki.vo.resp.EBookRespVo;
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

    public List<EBookRespVo> list(EBookVo req){
        EbookExample ebookExample = new EbookExample();
        ebookExample.createCriteria().andNameLike("%"+req.getName()+"%");
        List<Ebook> ebooks = ebookMapper.selectByExample(ebookExample);
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
