package com.jiawa.wiki.vo.resp;

import lombok.Data;

/**
 * @author yuu
 **/
@Data
public class EBookRespVo {
    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

}
