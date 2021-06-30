package com.jiawa.wiki.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuu
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EBookSaveVo {
    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer viewCount;

    private Integer voteCount;
}
